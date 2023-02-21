# My Quarkus

## Description
Rest API with Quarkus & Postgres

```
This Application will continue to be updated, so please wait for the next update.
```

## Prerequisites
- Java 17 or higher
- Maven 3.8.1 or higher
- Docker 20.10.7 or higher
- Postgres 13.3 or higher
- Postman 8.11.1 or higher
- IDE (IntelliJ IDEA, Eclipse, etc)
- Git 2.33.0 or higher
- Windows 10 or higher
- Linux (Ubuntu 20.04 or higher)
- Mac OS (Big Sur 11.5.2 or higher)
- Quarkus 2.2.3.Final or higher

## How to run
 ```
$ mvn compile quarkus:dev
 ```

## How to build
 ```
$ mvn clean package
 ```

## How to run binary build
 ```
$ java -jar target\quarkus-app\quarkus-run.jar
 ```

## Get all data
```
$ curl -L -X GET 'http://localhost:8080/api/v1/'
```

## Create new data
 ```
$ curl -L -X POST 'http://localhost:8080/transfer/' \
-H 'Content-Type: application/json' \
--data-raw '{
    "accountFrom":"4444",
    "accountTo": "55555",
    "amount" : 50000
}'
```

## Troubleshooting
Sometimes we run binary build directly and got below error,
```
no main manifest attribute, in target\my-quarkus-1.0.0.jar
``` 

above error happens because we are executing the wrong jar file within `target` folder, the right one (despite not an uberjar file) is actually on folder `target\quarkus-app`

## Docker build
Run below command to do a docker build
```
$ docker build -t my-quarkus .
```

And run it by using below command
```
$ docker run my-quarkus
```

Make sure to set the database connection on `application.properties` correctly first.