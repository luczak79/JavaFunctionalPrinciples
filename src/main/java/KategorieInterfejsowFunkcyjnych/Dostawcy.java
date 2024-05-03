package KategorieInterfejsowFunkcyjnych;

import java.util.function.Supplier;

public class Dostawcy {
    public static void main(String[] args) {
        Supplier <Double> random = () -> Math.random();
        Double result = random.get();
        System.out.println(result);
    }
}
