package chap03;

public class variable {//클래스블록
    public static void main(String[] args) {        //메소드블록
        int apple = 1;      //main 메서드 의 로컬변수
        int fruit = 0;      //main 메서드 의 로컬변수
//-------------------------------------------------------------------
        if (apple == 1) {         //if문 블록
            int banana = 2;      //if문 안에만 사용가능한  로컬변수(local variable) banana
            fruit = banana + apple;    //if문 밖의 변수 apple과 fruit를 사용
        }
//-------------------------------------------------------------------

        System.out.println(fruit);     //출력값 3
        System.out.println(apple);     //출력값
   //   System.out.println(banana);    //  banana변수는 if문 안에서만 사용가능  에러 발생
    }
}
