package chap11.sec06.exam02_reflection;

import java.lang.reflect.Constructor;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = Class.forName("chap11.sec06.exam02_reflection.Car");

        System.out.println("[클래스 이름]");
        System.out.println(clazz.getName());
        System.out.println();

        System.out.println("[생성자 정보]");
        Constructor[] constructors =clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getName());
                if (i < (parameters.length - 1)) {
                    System.out.print(",");
                }

            }
            System.out.println(")");
        }

    }
}
