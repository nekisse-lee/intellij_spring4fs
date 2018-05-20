package chap07extends.sec08.exam01_abstract;

public class StartPhone extends Phone {

    @Override
    public void function() {
        System.out.println("스마트폰입니다.");
    }

    public StartPhone(String owner) {
        super(owner);
    }

    public void internetSerch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
