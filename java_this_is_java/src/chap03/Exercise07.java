package chap03;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        caseEx();

    }

    private static void caseEx() {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("1.예금  2.출금  3.잔고  4. 종료");
            int menuNum = scanner.nextInt();
            switch (menuNum) {
                case 1:
                    System.out.print("예금액> ");
                    total += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    total -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔액> " + total);
                    break;
                case 4:
                    run = false;

            }
        }
        System.out.println("종료");
    }

    private static void whileEx() {
        int total = 0;

        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------");
            System.out.println("1.예금  2.출금  3.잔고  4. 종료");
            System.out.println("-------------------");
            System.out.println("입력> ");
            String input = scanner.nextLine();
            try {

                if (input.equals("1")) {
                    System.out.print("입금액> ");
                    int money = scanner.nextInt();
                    total += money;
                    System.out.println("입금 되었습니다.");
                } else if (input.equals("2")) {
                    System.out.print("출금액> ");
                    int money = scanner.nextInt();
                    total -= money;
                    System.out.println("출금 되었습니다.");
                } else if (input.equals("3")) {
                    System.out.print("잔액> ");
                    System.out.print(total);
                    System.out.println();
                } else if (input.equals("4")) {
                    run = false;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println("시스템 종료 ");
    }
}
