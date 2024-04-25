package ie.nic.kranthi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfig() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
                        .allowedOrigins("http://localhost:5173")
                        .allowedOrigins("http://ec2-3-250-189-231.eu-west-1.compute.amazonaws.com")
                        .allowedOrigins("http://ec2-51-20-250-151.eu-north-1.compute.amazonaws.com");
            }
        };
    }
}
