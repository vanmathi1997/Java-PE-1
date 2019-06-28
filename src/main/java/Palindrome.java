import java.util.*;
public class Palindrome {
      public static String findpalindrome(long number) {
        long rem=0,sum=0,add=0;
        long temp = number;
        while(number>0)
        {
            rem=number%10;
            if((rem%2)==0)
                add += rem;
            sum=(sum*10)+rem;
            number=number/10;

        }
        if((sum==temp)&&(add>25))
            return temp + "is a palindrome and the sum of even numbers is greater than 25";
        else if(sum!=temp)
            return temp+"is not palindrome";
        else{
            return temp+"is a palindrome and the sum of even numbers is less than 25";
        }
    }
}
