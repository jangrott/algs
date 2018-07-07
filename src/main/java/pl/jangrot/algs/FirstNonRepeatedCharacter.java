package pl.jangrot.algs;

public class FirstNonRepeatedCharacter {

    /*
    Find the first non-duplicate character in a string. Return null if no unique character is found.
     */
    public static Character firstNonRepeatedCharacter(String str) {
        if (str == null) {
            return null;
        }

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c] += 1;
        }
        for (char c : str.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }
        return null;
    }
}
