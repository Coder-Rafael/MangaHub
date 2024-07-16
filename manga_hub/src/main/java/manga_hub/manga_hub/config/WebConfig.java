package manga_hub.manga_hub.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("Configuring CORS...");
        System.out.println("Configuring CORS...");
        System.out.println("Configuring CORS...");
        registry.addMapping("/**")
                .allowedOrigins("https://mangahub.up.railway.app", "http://localhost:5500") 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

