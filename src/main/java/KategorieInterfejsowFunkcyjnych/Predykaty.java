package KategorieInterfejsowFunkcyjnych;

import java.util.function.Predicate;

public class Predykaty {
    public static void main(String[] args) {
        Predicate<Integer> over9000 = i -> i > 9000;
        System.out.println(over9000.test(10000));


    }
}
