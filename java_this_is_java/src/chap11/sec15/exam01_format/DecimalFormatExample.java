package chap11.sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0000000000.0000");
        System.out.println(df.format(num));

        df = new DecimalFormat("###########.0000");
        System.out.println(df.format(num));

        df = new DecimalFormat("##,###,###,###.0000");
        System.out.println(df.format(num));


    }

}
