package com.example.ycy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author niuben
 */
@Configuration
public class OkHttpConfig {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
