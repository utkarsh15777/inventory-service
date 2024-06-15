package com.tuppertech.microservices.inventory.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI InventoryServiceAPI(){
        return new OpenAPI()
                .info(new Info().title("Inventory Service API")
                        .description("REST APIs for Inventory Service")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0 "))
                )
                .externalDocs(new ExternalDocumentation().description("Refer to the Inventory serviceWIKI Documentation")
                        .url("https://Inventory-service-dummy-url.com/docs"));
    }
}