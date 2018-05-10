package chap03;

public class practise {
    public static void main(String[] args) {

        int pen = 534;
        int student = 30;

        int penPerStudent = pen / student;
        System.out.println(penPerStudent);

        int penLeft = pen % student;
        System.out.println(penLeft);

        int value = 356;
        System.out.println(value % 100);
        System.out.println(value/100*100);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println(area);

        System.out.println( 1 != 1);
    }
}
