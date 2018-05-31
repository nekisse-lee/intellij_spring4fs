package chap11.sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        boolean result = true;
        int count = 0;
        while (result) {
            //선택 번호
            int[] selectNumber = new int[6];
            Random random = new Random();
            System.out.print("선택번호 : ");
            for (int i = 0; i < 6; i++) {
                selectNumber[i] = random.nextInt(45) + 1;
                System.out.print(selectNumber[i] + " ");
            }
            System.out.println();

            //당첨 번호
            int[] winingNumber = new int[6];
            random = new Random();
            System.out.print("당첨 번호 : ");
            for (int i = 0; i < 6; i++) {
                winingNumber[i] = random.nextInt(45) + 1;
                System.out.print(winingNumber[i] + " ");
            }
            System.out.println();

            //당첨 여부
            Arrays.sort(selectNumber);
            Arrays.sort(winingNumber);

            result = winNumber(selectNumber, winingNumber);
            count++;
            System.out.println("count = " + count);
        }

    }

    private static boolean winNumber(int[] selectNumber, int[] winingNumber) {
        boolean result = Arrays.equals(selectNumber, winingNumber);
        System.out.print("당첨 여부 : ");
        if (result) {
            System.out.println("당첨 되엇습니다.");
            return false;
        } else {
            System.out.println("당첨 되지 않았습니다. ");
            return true;
        }
    }
}
