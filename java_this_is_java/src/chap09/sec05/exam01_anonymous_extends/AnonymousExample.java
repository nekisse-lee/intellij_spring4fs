package chap09.sec05.exam01_anonymous_extends;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.field.wake();

        Person person = new Person();
        person.wake();


        anonymous.method1();


        anonymous.method2(new Person() {
            String studentNo;

            void study() {
                System.out.println("ㄱ공부합니다..");
            }

            @Override
            void wake() {
                System.out.println("4시에 일어납니다.");
                study();
            }
        });

    }

}
