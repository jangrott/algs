package pl.jangrot.algs;

public class StringPalindrome {

    public static boolean isStringPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        int l = str.length() - 1;
        for (int i = 0; i <= l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i)) {
                return false;
            }
        }
        return true;
    }
}
