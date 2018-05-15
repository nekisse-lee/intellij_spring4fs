package chap05;

public class ArrayCopyExample {
    public static void main(String[] args) {

        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 1, newStrArray, 2, 2);

        for (String str :
                newStrArray) {
            System.out.print(str + ",");
        }
        System.out.println();
        System.out.println("주소가 같은지 : " + (oldStrArray[2] == newStrArray[3]));
        System.out.println("문자열이 같은지 : " + oldStrArray[2].equals(newStrArray[3]));


    }
}
