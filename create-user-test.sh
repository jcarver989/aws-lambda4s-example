#!/usr/bin/env bash

curl -X POST http://localhost:3000/api/v1/users -d "{ \"firstName\": \"Foo\" }"
