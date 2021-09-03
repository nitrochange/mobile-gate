package com.myproject.mobilegate

import models.Demo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.boot.runApplication
import org.jetbrains.exposed.sql.*

@SpringBootApplication
class MobileGateApplication

fun main(args: Array<String>) {

	val dbUrl = "jdbc:postgresql://localhost:5432/sample"
	val dbUser = "admin"
	val dbPass = "password"
	Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)
	transaction {
		addLogger(StdOutSqlLogger)
		SchemaUtils.drop (Demo)
		SchemaUtils.create (Demo)
	}

	runApplication<MobileGateApplication>(*args)
}
