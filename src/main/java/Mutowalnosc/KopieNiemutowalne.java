package Mutowalnosc;

import java.util.ArrayList;
import java.util.List;

public class KopieNiemutowalne {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("green");
        original.add("yellow");
        List<String> unmodifiable = List.copyOf(original);
        original.add("blue");
        System.out.println("BEFORE: " + unmodifiable.size());
        System.out.println("BEFORE: " + original.size());
        original.add("red");
        //unmodifiable.clear();
        System.out.println("AFTER: " + unmodifiable.size());
        System.out.println("AFTER: " + original.size());
    }
}
