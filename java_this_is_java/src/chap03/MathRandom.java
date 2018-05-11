package chap03;

public class MathRandom {
    public static void main(String[] args) {
        // 배열 생성
        int lotto[] = new int[6];
        System.out.print("Lotto 선택 숫자는 ");

        // 랜덤 값 반환
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = getRandomNum();
            // 중복 값 제거1
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

        System.out.print(" 입dffffd니다.dddddddddd");

    }

    private static int getRandomNum() {
        return (int) (Math.random() * 45) + 1;
    }

}
