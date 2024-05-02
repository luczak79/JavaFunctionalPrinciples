import java.util.function.Function;

public class KierunekKompozycjiFunkcyjnej {
    public static void main(String[] args) {
        Function<String, String> removeLowerCaseA = str -> str.replace("a", "");
        Function<String, String> upperCase = String::toUpperCase;

        var input = "abcd";

        String andThen = removeLowerCaseA.andThen(upperCase).apply(input);
        System.out.println(andThen);

        String compose = upperCase.compose(removeLowerCaseA).apply(input);
        System.out.println(compose);
    }
}
