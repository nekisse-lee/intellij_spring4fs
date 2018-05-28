package chap11.sec08.exam01_split_stringtokennizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        String text = "박연수/이수홍/홍길동";
        StringTokenizer st = new StringTokenizer(text, "/");

        int countTokens = st.countTokens();
        System.out.println("countTokens = " + countTokens);
        for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            int countTokens1 = st.countTokens();
            System.out.println("token = " + token);
            System.out.println("countTokens1 = " + countTokens1);
        }

        System.out.println();
        st = new StringTokenizer(text, "/");
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            System.out.println("token = " + token);
            System.out.println("st.countTokens() = " + st.countTokens());
        }


    }
}
