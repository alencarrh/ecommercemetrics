package com.arh.commerce.productapi.service

import org.springframework.stereotype.Service

@Service
class SearchProductService {

  fun findProductById(id: String): String = "Product, $id!"
}
