package models

import org.jetbrains.exposed.sql.Table

object Holder: Table() {
    val id = integer("id").autoIncrement()
    val firstName = varchar("firstName", 50)
    val secondName = varchar("secondName", 50)
    val address = varchar("address",50)
}