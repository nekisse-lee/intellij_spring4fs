package chap15_collection;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "대한민국";
        char s = str.charAt(0);
        int d = s;
        System.out.println("d = " + d);
        List<String> list = new ArrayList<>();
        list.add("김나박");                    //맨끝에 객체 추가
        list.add("박효신");                    //맨끝에 객체 추가
        list.add(0, "홍길동");                 //저장된 인덱스에 객체 삽입
        String index1 = list.get(1);         //인덱스로 객체 찾기
        System.out.println("index1 = " + index1); //출력
        System.out.println();                //공백

        //list를 반복하며 객체를 꺼내서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
        System.out.println(list.size());        //리스트의 사이즈
        System.out.println();       //공백

        list.remove(0);      //인덱스로 객체삭제
        list.remove("김나박");    // 객체 삭제

        //list를 반복하며 객체를 꺼내서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
        System.out.println(list.size());        //리스트의 사이즈
    }
}
