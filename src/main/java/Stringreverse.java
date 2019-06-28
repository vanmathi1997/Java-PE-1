import java.util.*;
public class Stringreverse {

    public static String stringreverse(String source) {

        String reverse = new String();
        if (source != null) {
            for (int i = source.length() - 1; i >= 0; i--) {
                reverse = reverse + source.charAt(i);
            }
            return reverse;
        } else return null;

    }
}


