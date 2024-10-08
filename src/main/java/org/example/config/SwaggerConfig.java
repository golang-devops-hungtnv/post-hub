package org.example.config;



import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Value("${api.endpoint}")
    private String endPoint;

    @Bean
    public OpenAPI openApi() {
        Server server = new Server();
        server.setUrl(endPoint);
        server.setDescription("Codebase backend service development");

        Contact contact = new Contact();
        contact.setEmail("test@example.com");
        contact.setName("Test");
        contact.setUrl("https://example.com");

        License license =
                new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info =
                new Info()
                        .title("Codebase APIs")
                        .version("1.0.0-SNAPSHOT")
                        .contact(contact)
                        .license(license);

        final String securitySchema = "BearerAuth";

        return new OpenAPI()
                .components(
                        new Components()
                                .addSecuritySchemes(
                                        securitySchema,
                                        new io.swagger.v3.oas.models.security.SecurityScheme()
                                                .name(securitySchema)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("Bearer")
                                                .bearerFormat("JWT")))
                .info(info)
                .servers(Collections.singletonList(server));
    }
}