package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

        ConfigurableEnvironment environment = context.getEnvironment();

        for (String activeProfile : environment.getActiveProfiles())
        {
            System.out.println(activeProfile);
        }

        if (environment.acceptsProfiles("dev")) {
            context.register(Dev.class);
            Dev devobj = context.getBean(Dev.class);
            devobj.devConfig();
        }
        else if (environment.acceptsProfiles("prod"))
        {
            context.register(Prod.class);
            Prod prodobj = context.getBean(Prod.class);
            prodobj.ProdConfig();
        }

        visitor bean = context.getBean(visitor.class);
        bean.VisitorConfig();

    }
}
