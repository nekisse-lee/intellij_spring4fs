package chap05;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {

        String[] strArray = new String[]{"java", "java", new String("java")};

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[1].equals(strArray[2]));

        String[] copyArray = strArray.clone();
        for (String str :
                copyArray) {
            System.out.println(str);
        }
    }
}
