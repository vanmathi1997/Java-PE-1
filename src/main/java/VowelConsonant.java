import java.util.*;
public class VowelConsonant {

    public static String findvowelconsonant(String inputword)
    {String result=" ";
    if(inputword!=null) {
        for (int i = 0; i < inputword.length(); i++) {
            char letter = inputword.charAt(i);//splitting the letters of the word
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')

                result += "Vowel";//display the user if it satisfies the if-clause

            else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
                result += " Consonant";//display consonant if not a vowel

            else
                result += " Not an alphabet";
        }

        return result;
    }
    return null;

    }

}
