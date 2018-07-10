package pl.jangrot.algs;

public class InsertStars {

    /*
    Given a string, recursively compute a new string where the identical adjacent characters in the original string are separated by a "*".
     */
    public static String insertPairStar(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.substring(0,1));
        if (s.charAt(0) == s.charAt(1)) {
            sb.append("*");
        }
        sb.append(insertPairStar(s.substring(1)));
        return sb.toString();
    }
}
