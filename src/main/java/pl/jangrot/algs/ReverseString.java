package pl.jangrot.algs;

public class ReverseString {

    public static String reverseString(String str) {
        if (str == null || str.length() == 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
