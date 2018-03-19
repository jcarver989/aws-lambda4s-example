# Example For An AWS Lambda Function Written In Scala, Complete With CloudFormation & SAM Local Support

## What Is This?

This is a fully working example of an API built with AWS Lambda + API Gateway (proxy integration) written in Scala. It is built ontop of [aws-lambda4s](https://github.com/jcarver989/aws-lambda4s) which provides minimal boilerplate for making AWS Lamdba development pleasent in Scala. 

## Why Should I Use This?

By cloning this repo, you can get a fully working API using Lambda + API Gateway, that you can run locally in minutes.

More specifically, this repo gives you::

- All the boilerplate you need to get started writing AWS Lambda functions in Scala
- Automatic serialization of AWS Lambda's JSON input/output into nice Scala case classes
- Logging, it's already setup for you using AWS Lambda's custom log4j2 appender
- A complete CloudFormation template that allows you to run your Lambda locally or deploy it with a single command, using AWS's command line tools.

## How Do I Get Started?

1. Clone this repo
2. Install [the SAM cli tool](https://github.com/awslabs/aws-sam-local)
3. Run `sbt assembly` to build your fat jar
4. Run `sam local start-api` to start the AWS lambda + API Gateway integration locally
5. Run one of the test scripts, e.g. `./get-user-test.sh` or just `curl http://localhost:3000/path/to/your/api`
6. Modify as for your own project as you wish.
7. When you're ready, deploy your project using sam, see [here](https://github.com/awslabs/aws-sam-local#package-and-deploy-to-lambda)
