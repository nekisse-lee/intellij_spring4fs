package main;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring.Client2;

public class main2 {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("springconf.xml");

        Client2 client2 = ctx.getBean("client2", Client2.class);
        client2.send();
        ctx.close();

    }
}
