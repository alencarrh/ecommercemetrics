package com.arh.commerce.productapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class ProductApiApplication

fun main(args: Array<String>) {
  runApplication<ProductApiApplication>(*args)
}
