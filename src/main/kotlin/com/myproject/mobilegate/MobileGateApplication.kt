package com.myproject.mobilegate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MobileGateApplication

fun main(args: Array<String>) {
	runApplication<MobileGateApplication>(*args)
}
