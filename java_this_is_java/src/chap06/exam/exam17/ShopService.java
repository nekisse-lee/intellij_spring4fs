package chap06.exam.exam17;

public class ShopService {


    private static ShopService singleton = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {
        return singleton;

    }


}
