package chap10.verify.exam07;

public class LoginExample {
    public static void main(String[] args) {

        try {
            login("white", "12345");
        } catch (WrongPasswordException e) {
            String message = e.getMessage();
            System.out.println(message);
        } catch (NotExistIDException e) {
            String message = e.getLocalizedMessage();
            System.out.println(message);
        }


    }

    private static void login(String id, String password) throws WrongPasswordException, NotExistIDException {
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }

        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }


    }


}
