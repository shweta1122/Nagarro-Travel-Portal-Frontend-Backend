package com.nagarro.sweta.employeetravelmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
                registry.addMapping("/yepath").allowedOrigins("ye client (frontend)ip").allowedMethods("ye moethod");
            }
        };
    }
}//ye cors wla nh smjh aaya
// ye issliye h kuki hum different port se access krr rhe data ko...ok
//configuration krne ke tarke alg alg hotey h???cors ke? ha...theek..toh phr sare path ke liye  likhna prega na phr toh//ha theek ** got it...hnn