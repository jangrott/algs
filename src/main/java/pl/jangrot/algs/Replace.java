package pl.jangrot.algs;

public class Replace {

    /*
    Write a method to replace all spaces in a string with a given replacement string.
     */
    public static String replace(String a, String b) {
        if (a == null || b == null) {
            return a;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c == ' ') {
                sb.append(b);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
