import java.util.*;
public class CapitalLetter {

        public static String findcapitalletter(char input)
        {
            if(Character.isUpperCase(input)) //condition for capital-letter
            {
                return("Capital Letter");
            }
            else if(Character.isLowerCase(input))//condition for lower case letter
                return("Lower case letter");

            else if(input>='0'&& input<='9')//condition for number digit or some special character
                return ("Number Digit");
            else
               return ("Some Special Character");
        }
    }
