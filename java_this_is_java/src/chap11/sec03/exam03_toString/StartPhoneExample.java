package chap11.sec03.exam03_toString;

public class StartPhoneExample {
    public static void main(String[] args) {

        StartPhone myPhone = new StartPhone("구글", "안드로이드");
        String strObj = myPhone.toString();


        System.out.println("strObj = " + strObj);

        System.out.println(myPhone);


    }
}
