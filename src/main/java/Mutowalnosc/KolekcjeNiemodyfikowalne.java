package Mutowalnosc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KolekcjeNiemodyfikowalne {

    /////////////////////////////////////////
    // Collections.unmodifiable.....
    // Collections.unmodifiableList(List<T>)
    /////////////////////////////////////////
    public static void main(String[] args) {
        List<String> modifiable = new ArrayList<>();
        modifiable.add("green");
        modifiable.add("yellow");
        List<String> unmodifiable1 = Collections.unmodifiableList(modifiable);

        /////////////////////////////////////
        //throw UnsupportedOperationException
        //unmodifiable1.clear();
        /////////////////////////////////////

        modifiable.add("red"); //it will change the size of unmodifiable2
        System.out.println("Size unmodifiable1: " + unmodifiable1.size());
    }
}
