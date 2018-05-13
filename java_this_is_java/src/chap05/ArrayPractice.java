package chap05;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] scores;
        scores = new int[]{22, 22, 22};

        int sum = add(new int[]{33, 33, 33});

        int sum2 = add(scores);
        System.out.println(sum);
        System.out.println(sum2);



/*
        int[] scroes;
        scroes = new int[]{22, 33, 44};

        for (Integer scoress : scroes
                ) {
            System.out.println(scoress);
        }
*/
    }
    public static int add( int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
