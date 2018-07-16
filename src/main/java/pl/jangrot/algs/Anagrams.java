package pl.jangrot.algs;

public class Anagrams {

    public static boolean isAnagram(String input1, String input2) {
        if (input1 == null || input2 == null || (input1.length() != input2.length())) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0; i < input1.length(); i++) {
            freq[input1.charAt(i)]++;
            freq[input2.charAt(i)]--;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
