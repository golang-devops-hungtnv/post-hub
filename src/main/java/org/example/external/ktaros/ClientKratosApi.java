package org.example.external.ktaros;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sh.ory.kratos.ApiClient;
import sh.ory.kratos.api.FrontendApi;

@Configuration
public class ClientKratosApi {
    @Value("${kratos.path}")
    private String path;

    @Bean
    public FrontendApi frontendApi() {
        ApiClient client = new ApiClient();
        client.setBasePath(path);

        return new FrontendApi(client);
    }
}
