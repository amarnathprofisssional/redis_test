package com.example.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Redis Service",
                description = "Sample Redis Service",
                contact = @Contact(
                        name = "Testing Redis Service",
                        email = "amarnathprofissional@gmail.com"
                ),
                license = @License(name = "Free Use")),
        servers = @Server(url = "http://localhost:8080")
)
public class OpenAPIConfiguration {
}
