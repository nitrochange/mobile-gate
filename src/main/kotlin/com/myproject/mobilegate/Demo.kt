package com.myproject.mobilegate

import org.jetbrains.exposed.sql.Table


object Demo : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 50)
}