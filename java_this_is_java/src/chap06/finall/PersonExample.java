package chap06.finall;

public class PersonExample {
    public static void main(String[] args) {

        Person person = new Person("111111-1111111", "nekisse");
        System.out.println(person.nation);
        System.out.println(person.name);
        System.out.println(person.ssn);

//        person.nation = "america";

        person.name = "perci";

        System.out.println(person.name);
    }
}
