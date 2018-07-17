package pl.jangrot.algs;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    /*
     Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words.
     The returned ArrayList should be lexically alphabetically.
     */
    public static List<String> removeDuplicates(List<String> input) {
        return new ArrayList<>(
                input.stream().collect(Collectors.toCollection(() -> new TreeSet<>(String::compareTo)))
        );
    }
}
