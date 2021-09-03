package models

import org.jetbrains.exposed.sql.Table


object Card : Table() {
    val id = integer("id").autoIncrement()
    val ownerId = integer("ownerId")
    val number = varchar("number", 50)
}