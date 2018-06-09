package chap13_generic.sec07.exam01_generic_extends_implement;

public class 자식제품그리고보관소Example {
    public static void main(String[] args) {

        자식제품<Tv, String, String> 제품 = new 자식제품<>();

        제품.set종류(new Tv());
        제품.set모델("스마트티비");
        제품.set회사("삼성");


        보관소<Tv> 보관소 = new 보관소Impl<>(100);

        보관소.추가(new Tv(), 0);
        Tv tv = 보관소.get(0);

    }
}
