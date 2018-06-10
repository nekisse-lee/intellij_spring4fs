package chap14.sec03.exam03_return;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2,5));  //실행 결과   7

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2,5));  //실행 결과   7

        fi = (x, y) ->   x + y;      //중괄호 블럭에 return문만 있을경우  중괄호 생략가능, return 생략가능
        System.out.println(fi.method(2,5));  //실행 결과   7


        //아래의 static int sum() 으로 실행
        fi = (x, y) -> sum(x, y);    //   == {return sum(x, y);};
        System.out.println(fi.method(2,5));  //실행 결과   7

    }
    public static int sum(int x, int y) {
        return (x + y);
    }
}

