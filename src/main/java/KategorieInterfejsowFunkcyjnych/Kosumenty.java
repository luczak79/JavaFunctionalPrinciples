package KategorieInterfejsowFunkcyjnych;

import java.util.function.Consumer;

public class Kosumenty {
    public static void main(String[] args) {
        Consumer<String> println = str -> System.out.println(str);
        println.accept("Hello World");
    }
}
