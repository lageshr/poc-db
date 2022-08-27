package com.poc.dbpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbPocApplication

fun main(args: Array<String>) {
	runApplication<DbPocApplication>(*args)
}
