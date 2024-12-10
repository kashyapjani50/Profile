package org.example;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@PropertySource("classpath:application.properties")
public class visitor {

    @Value("${app.name}")
    private String name;





    public void VisitorConfig() {

        System.out.println(name);

        System.out.println("Visitor Configuration Active");


    }




}
