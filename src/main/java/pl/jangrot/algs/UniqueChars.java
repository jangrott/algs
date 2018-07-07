package pl.jangrot.algs;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {

    /*
    Write a method that takes in an input String and returns true if all the characters in the String are unique and
    false if there is even a single repeated character.
     */
    public static boolean areAllCharactersUnique(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        Set<Character> characters = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!characters.add(c)) {
                return false;
            }
        }

        return true;
    }
}
