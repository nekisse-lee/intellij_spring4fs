package main;

import config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.Client2;

public class Main3JavaConfig {
    public static void main(String[] args) {

        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        Client2 client2 = ctx.getBean("client2", Client2.class);
        client2.send();
        ctx.close();

    }


}
