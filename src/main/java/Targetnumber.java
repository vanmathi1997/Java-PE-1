import java.util.*;
import java.util.Random;
public class Targetnumber {

    public static String gettarget(int targetnumber,int guessednumber) {

        do {

            if (guessednumber == targetnumber)//check whether the guess number matches the target number
            {
                return ("Number guessed matches the original number");
            } else if (guessednumber > targetnumber) {
                return ("Number guessed is greater than the original number");
            } else if (guessednumber < targetnumber) {
                return ("Number guessed is less than the original number");
            }
        } while (guessednumber != targetnumber);
        return null;

    }
}



