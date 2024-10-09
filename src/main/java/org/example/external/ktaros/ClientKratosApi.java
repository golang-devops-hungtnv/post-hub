package org.example.external.ktaros;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sh.ory.kratos.ApiClient;
import sh.ory.kratos.api.FrontendApi;

@Configuration
public class ClientKratosApi {
    @Value("${kratos.path}")
    private String path;

    @PostConstruct
    public void init() {
        System.out.println("Kratos Path: " + path);
    }

    @Bean
    public FrontendApi frontendApi() {
        ApiClient client = new ApiClient();
        client.setBasePath(path);

        return new FrontendApi(client);
    }


}
