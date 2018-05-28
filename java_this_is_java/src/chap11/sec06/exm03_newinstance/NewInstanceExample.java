package chap11.sec06.exm03_newinstance;

public class NewInstanceExample {
    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("chap11.sec06.exm03_newinstance.ReceiveAction");

            Action action = (Action) clazz.newInstance();

            action.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
