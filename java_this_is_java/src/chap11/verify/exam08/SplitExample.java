package chap11.verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {

        String str = "아이디,이름,패스워드";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println();

        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
