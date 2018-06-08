package chap13_generic.sec02.exam01_none_generic_type;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("가나다");
        String str  = (String) box.getObject();

        box.setObject(new Apple());

    }
}
