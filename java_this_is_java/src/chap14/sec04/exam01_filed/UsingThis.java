package chap14.sec04.exam01_filed;

public class UsingThis {
    public int outterField1 = 10;
    public int Filed2 = 1000;

    class Inner {
         int innerField1 = 20;
         int Field2 = 2000;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField = " + outterField1);  //결과값 10
                System.out.println("innerField = " + innerField1);   //결과값 20

                System.out.println("Field2 = " + Field2);   // 결과값 2000
                System.out.println("Field2 = " + Field2);   // 결과값 2000

                System.out.println("UsingThis.this.Filed2 = " + UsingThis.this.Filed2); //결과값 1000
                System.out.println("this.Field2 = " + this.Field2);      //  또는 Field2 호출 결과값 2000
            };
            fi.method();
        }
    }
}
