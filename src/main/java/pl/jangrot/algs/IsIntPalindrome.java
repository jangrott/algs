package pl.jangrot.algs;

public class IsIntPalindrome {

    public static Boolean isIntPalindrome(int x) {
        int num = x, rev = 0, dig;
        while (num > 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        return x == rev;
    }
}
