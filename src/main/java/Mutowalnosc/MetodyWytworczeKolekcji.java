package Mutowalnosc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MetodyWytworczeKolekcji {
    public static void main(String[] args) {
        List<String> modifiable = new ArrayList<>();
        modifiable.add("green");
        modifiable.add("yellow");
        List<String> unmodifiable = List.of("red", "green", "yellow");
        System.out.println(unmodifiable);

        Set<String> unmodifiableSet = Set.of("John", "Bob", "Donald");
        System.out.println(unmodifiableSet);

        /////////////////////////////////
        // throws UnsupportedOperationException
        // unmodifiable.clear();
        // unmodifiable.add("purple");
        /////////////////////////////////
    }
}
