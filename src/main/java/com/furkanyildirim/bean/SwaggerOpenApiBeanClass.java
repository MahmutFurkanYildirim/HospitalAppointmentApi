package com.furkanyildirim.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// LOMBOK
@Log4j2

// http://localhost:8080/swagger-ui.html

@Configuration
public class SwaggerOpenApiBeanClass {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Hospital Appointment API")
                        .version("1.0")
                        .description("API for managing hospital appointments"));
    }

}
