package chap06.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {


        Method[] declaredMethod = Service.class.getDeclaredMethods();

        for (Method method : declaredMethod) {
            if (method.isAnnotationPresent(PrintAnnotaion.class)) {
                PrintAnnotaion printAnnotaion = method.getAnnotation(PrintAnnotaion.class);

                System.out.println("[" + method.getName() + "]");

                for (int i = 0; i < printAnnotaion.number(); i++) {
                    System.out.print(printAnnotaion.value());
                }
                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (Exception e) {

                }
                System.out.println();
            }
        }

    }
}
