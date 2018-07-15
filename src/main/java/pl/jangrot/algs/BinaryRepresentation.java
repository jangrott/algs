package pl.jangrot.algs;

public class BinaryRepresentation {

    public static String computeBinary(int val) {
        if (val == 0 || val == 1) {
            return String.valueOf(val);
        }

        StringBuilder sb = new StringBuilder();

        int r;
        while(val > 0) {
            r = val % 2;
            val /= 2;
            sb.append(r);
        }

        return sb.reverse().toString();
    }
}
