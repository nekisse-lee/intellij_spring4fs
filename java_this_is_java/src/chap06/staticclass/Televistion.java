package chap06.staticclass;

public class Televistion {
    static String company = "Samsung";
    static String model = "LCD";

    static String info;


    static{
        info = company + "-" + model;
    }

}
