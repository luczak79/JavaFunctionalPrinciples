package KategorieInterfejsowFunkcyjnych;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Funkcje {

    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str != null ? str.length() : 0;
        Integer result1 = stringLength.apply("Jan");
        System.out.println("result1:" + result1);
        Integer result2 = stringLength.apply(null);
        System.out.println("result2:" + result2);

        BinaryOperator<String> plusJoiner = Funkcje::removeFirstPlus;
        String result3 = plusJoiner.apply("hello", "world");
        System.out.println(result3);

        String reduceResult = Stream.of("Johny", "be", "good").reduce("", plusJoiner);
        System.out.println(reduceResult);

        List<String> stringList = Arrays.asList("a", "b", "c");
        List<Integer> integerList = Arrays.asList(1,2,3);

        List<String> combinedList = listCombiner(stringList, integerList, (String letter, Integer number) -> letter + number);
        System.out.println(combinedList);

        List<Double> list1 = Arrays.asList(1.0d, 2.1d, 3.3d);
        List<Float> list2 = Arrays.asList(0.1f, 0.2f, 4f);

        List<Boolean> listChecker = listCombiner(list1, list2, (doubleNumber, floatNumber) -> doubleNumber > floatNumber);
        System.out.println(listChecker);

        //Composing BiFunctions
        List<Double> doubleList1 = Arrays.asList(1.0d, 2.1d, 3.3d);
        List<Double> doubleList2 = Arrays.asList(1.1d, 0.2d, 4d);
        List<Boolean> result = listCombiner(doubleList1,doubleList2,asBiFunction(Double::compareTo).andThen(i -> i > 0));
        System.out.println(result);
    }

    private static <T, U, R> BiFunction<T, U, R> asBiFunction(BiFunction<T, U, R> function) {
        return function;
    }

    private static <T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
        List<R> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(combiner.apply(list1.get(i), list2.get(i)));
        }
        return result;
    }

    static private String removeFirstPlus(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        return a + "+" + b;
    }

}