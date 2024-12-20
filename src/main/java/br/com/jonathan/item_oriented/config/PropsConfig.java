package br.com.jonathan.item_oriented.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer config(){
        PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
        config.setLocation(new FileSystemResource("C:\\tmp\\application.properties"));
        return config;
    }
}
