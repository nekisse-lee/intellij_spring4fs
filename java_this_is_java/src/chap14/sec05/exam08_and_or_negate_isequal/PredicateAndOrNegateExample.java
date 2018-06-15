package chap14.sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2의 배수를 검사
        IntPredicate predicateA = a -> { return (a % 2 == 0); };

        //3의 배수를 검사
        IntPredicate predicateB = a ->{ return (a % 3 == 0);};

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까? " + result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까? " + result);

        //negate
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 false 입니까? " + result);
    }
}
