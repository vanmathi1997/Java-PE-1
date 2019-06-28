import java.util.*;
public class AddUnspecifiedInputs {

    public int findsum(String input) {
        int number = 0, sum = 0;
        Scanner in = new Scanner(System.in);
        in = new Scanner(input);
        if (in != null) {
            while (in.hasNextLine())//add the inputs
            {
                number = in.nextInt();
                sum += number;

            }
            return sum;

        } else
            return 0;
    }
}
