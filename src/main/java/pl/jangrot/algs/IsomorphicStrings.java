package pl.jangrot.algs;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String input1, String input2) {
        if (input1 == null || input2 == null || (input1.length() != input2.length())) {
            return false;
        }

        int[] freqInput1 = new int[256];
        int[] freqInput2 = new int[256];


        for (int i = 0; i < input1.length(); i++) {
            freqInput1[input1.charAt(i)]++;
            freqInput2[input2.charAt(i)]++;

            if (freqInput1[input1.charAt(i)] != freqInput2[input2.charAt(i)]) {
                return false;
            }
        }

        return true;
    }
}
