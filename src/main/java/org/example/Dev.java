package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Component
@Profile("dev")
public class Dev {

    public void devConfig() {
        System.out.println("Development Configuration Active");
    }

}
