package chap03;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        while (true) {
            int num = (int) (Math.random() * 6 + 1);
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("종료");

    }

    private static void qExit() {
        System.out.println("입력하세요");
        System.out.println("종료는 q");


        Scanner scanner = new Scanner(System.in);
        String inputString;
        do {
            System.out.println(">");

            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q"));
        System.out.println();
        System.out.println("종료");
    }
}
