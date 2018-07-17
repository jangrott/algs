package pl.jangrot.algs;

public class StringCompression {

    /*
    Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.
     */
    public static String compressString(String text) {
        if (text == null) return null;

        int textLength = text.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < textLength; i++) {
            count++;

            if (i + 1 >= textLength || text.charAt(i) != text.charAt(i + 1)) {
                if (count > 1) {
                    sb.append(text.charAt(i)).append(count);
                } else {
                    sb.append(text.charAt(i));
                }

                count = 0;
            }
        }

        return sb.length() < textLength ? sb.toString() : text;
    }
}
