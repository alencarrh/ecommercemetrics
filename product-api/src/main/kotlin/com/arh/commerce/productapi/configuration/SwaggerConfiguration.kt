package com.arh.commerce.productapi.configuration

import io.swagger.v3.oas.annotations.Hidden
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@RestController
class SwaggerConfiguration {

  @GetMapping("/") @Hidden fun swagger(): String = "redirect:swagger-ui.html"

  @Bean
  fun allApi(): GroupedOpenApi {
    return GroupedOpenApi.builder().group("all").pathsToMatch("/**").build()
  }

  @Bean
  fun internalApi(): GroupedOpenApi {
    return GroupedOpenApi.builder().group("internal").pathsToMatch("/internal/**").build()
  }

  @Bean
  fun publicApi(): GroupedOpenApi {
    return GroupedOpenApi.builder().group("public").pathsToMatch("/public/**").build()
  }
}
