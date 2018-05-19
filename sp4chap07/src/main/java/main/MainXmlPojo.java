package main;

import chap07extends.Calculator;
import chap07extends.ImpeCalculator;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlPojo {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("aopPojo.xml");

        ImpeCalculator impeCal = ctx.getBean("impeCal", ImpeCalculator.class);
        long fiveFact1 = impeCal.factorial(5);
        System.out.println("impeCal.factorial(5) = " + fiveFact1);



        Calculator recCal = ctx.getBean("recCal", Calculator.class);
        long fiveFact2 = recCal.factorial(5);
        System.out.println("recCa.factorial(5) = " + fiveFact2);



    }

}
