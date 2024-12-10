package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Component
@Profile("prod")
public class Prod {

    public void ProdConfig() {
        System.out.println("Production Configuration Active");
    }



}
