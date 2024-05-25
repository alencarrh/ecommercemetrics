package com.arh.commerce.productapi.controller

import com.arh.commerce.productapi.service.SearchProductService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/internal/products")
@Tag(name = "Internal Product", description = "Internal endpoints for Product")
class InternalProductController(private val searchProductService: SearchProductService) {

  @PostMapping("/{id}")
  fun findById(@PathVariable id: String) = searchProductService.findProductById(id)
}
