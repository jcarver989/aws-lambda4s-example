# Example For An AWS Lambda Function Written In Scala, Complete With CloudFormation & SAM Local Support

## What Is This?

This is a fully working example of an API built with AWS Lambda + API Gateway (proxy integration) written in Scala. It is built ontop of [aws-lambda4s](https://github.com/jcarver989/aws-lambda4s) which provides minimal boilerplate for making AWS Lamdba development pleasent in Scala. 

This example comes with a working CloudFormation template which means that you can run & test your Lamdba API locally & deploy it to production with a single command using AWS's `sam` CLI tool.

## Getting Started

1. Checkout this repo
2. Install [SAM Local](https://github.com/awslabs/aws-sam-local)
3. Run `sam local start-api` to start the AWS lambda + API Gateway integration locally
4. Run one of the test scripts, e.g. `./get-user-test.sh` or just `curl http://localhost:3000/path/to/your/api`
5. Modify as for your own project as you wish.
