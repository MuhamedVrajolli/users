## What You Will build

This is a simple Java project made  spring boot framework and uses postgreSQL which are built in & runs on docker environment.

## Building application

### Pre-requisites
- Docker CLI
- Java JDK 11+
- Gradle 6.0+

### Step 1: Building Executable JAR and docker image
To create an `executable jar`  of the project also to build `image on docker`, simply run the command:

```sh
./deploy/build-image.sh
```

### Step 2: Building docker & Run
Creates the `network`, needed `volumes` for services and to `install & run all services` on docker. After this script is finished, the services start running and are ready to use.

```sh
./deploy/init-setup.sh
```

## Application & Routing

Now, that we built the images and services are running in our machine, we can explore how services are behaving.

#### Spring boot service url

```
http://localhost:8080
```

#### PgAdmin4 panel url

```
http://localhost:8854
```

Use the following credentials to login:

```
Username: muhamed.s.vrajolli@gmail.com
Password: q5sH6d7XpNaeuGAD
```

#### PostgreSQL server url

```
http://localhost:5432
```

Use the following credentials to login:

```
Username: postgres
Password: 123456
```

#### API documentation url

```
http://localhost:8080/docs
```
