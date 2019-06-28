import java.util.Scanner;
public class CharacterRepeat {
    public static String repeat(String input, int number)//function to repeat characters
    {String output="";
        char letter;
        int length = input.length();//get the length
        int repeat = length - number;
        if (input != null)
        {
             for (int i = 0; i < number; i++)//repeat the string
             {
                output+=input.substring(repeat);

            }
            return input+output;
        }
        return null;
    }

}
