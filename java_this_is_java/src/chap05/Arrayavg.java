package chap05;

public class Arrayavg {
    public static void main(String[] args) {

        int score;

        int[] studentScore = new int[6];
        double avg = 0;


        for (int i = 0; i < studentScore.length; i++) {
            studentScore[i] = getRandomNum();
            avg += studentScore[i];
            System.out.println(studentScore[i]);
            }

        System.out.println("평균 =" + (avg / studentScore.length));

        System.out.println(studentScore[0]);


        }


    public static int getRandomNum() {
        int num = (int) ((Math.random() * 21) + 80);
        return num;
    }
}
