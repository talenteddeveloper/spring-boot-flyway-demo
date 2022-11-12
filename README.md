
# spring-boot-flyway-demo

#### In this project you will learn how to integrate Flyway in your Spring Boot application 
## Introduction
Flyway is the Apache v2 licensed open-source tool that makes database migrations easy. You can think of Flyway as version control for your database. It lets you evolve your database schema easily and reliably across all your instances.

Flyway updates a database from one version to the next using migrations. We can write migrations either in SQL with database-specific syntax or in Java for advanced database transformations.

Migrations can either be versioned or repeatable. The former has a unique version and is applied exactly once. The latter does not have a version. Instead, they are (re-)applied every time their checksum changes.


## Requirements

- Java - 1.8.x

- Maven - 3.x.x

- MySQL - 5.x.x


## Steps to setup

### 1. Clone the application
```bash
  git clone https://github.com/talenteddeveloper/spring-boot-flyway-demo.git
```

### 2. Create Mysql database
```bash
  create database flyway_demo
```

### 3. Change mysql username and password as per your installation

- open `src/main/resources/application.properties `

- change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

### 4. Build and run the app using maven
```bash
  mvn spring-boot:run
```
    
## How does Flyway manage migrations?
Flyway creates a table called `flyway_schema_history`  when it runs the migration for the first time and stores all the meta-data required for versioning the migrations in this table.
You can check the contents of  `flyway_schema_history `table in your mysql database

It stores the current migration’s version, script file name, and checksum among other details in the table.

When you run the app, Flyway first validates the already applied migration scripts by calculating their checksum and matching it with the checksum stored in the meta-data table.

So, If you change `V1__init.sql` after the migration is applied, Flyway will throw an error saying that the checksum doesn’t match.

Therefore, for doing any changes to the schema, you need to create another migration script file with a new version`V2__<NAME>.sql ` and let Flyway apply that when you run the app.


## Youtube Channel

For more please check talented developer  https://www.youtube.com/c/TalentedDeveloper 

