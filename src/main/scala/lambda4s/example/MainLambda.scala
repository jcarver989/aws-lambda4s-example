
package lambda4s.example

import org.json4s.{ Formats, NoTypeHints }
import org.json4s.native.Serialization

import com.amazonaws.services.lambda.runtime.Context

import lambda4s.{ Get, JSON, LambdaProxyFunction, Post, Request, Response }

case class User(firstName: String)
case class Status(status: String)

object JSONSupport extends JSON {
  override implicit val formats: Formats = Serialization.formats(NoTypeHints)
}

class MainLambda() extends LambdaProxyFunction {
  override protected val jsonSerializer = JSONSupport

  override def handle(request: Request, context: Context): Response = {
    logger.info(s"Request Recieved ${request}")
    request match {
      case Get("api", "v1", "users", userId) =>
        if (userId == "123") {
          Response(body = JSON.toJSON(User("Bob Sagat")))
        } else {
          Response(statusCode = 500, body = JSON.toJSON(Status(s"user ${userId} doesn't exist")))
        }

      case Post("api", "v1", "users") =>
        val user = JSON.fromJSON[User](request.body)
        // pretend we put something in a DB
        Response(body = JSON.toJSON(Status("Created User")))

      case _ => Response(statusCode = 404, body = JSON.toJSON(Status("path not found")))
    }
  }
}