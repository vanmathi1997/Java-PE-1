import java.util.*;
public class Sort {
    public  String sort(int number)
    {
        String var="";

        List<Integer> numberlist= new ArrayList<>();
        List<String> stringlist= new ArrayList<>();
        for (int i = number; i > 0; i /= 10)
            numberlist.add(i % 10);
        Collections.sort(numberlist);  // sorting list in ascending order
        Collections.reverse(numberlist); //sorting list in descending order
        for(int i=0;i< numberlist.size();i++)
        {
            var+=numberlist.get(i);
        }
        return var;
    }

    public int add(int number)
    {
        int temp=number,remainder,sum=0;
        while(temp>0)
        {
            remainder=temp%10;
            if(remainder%2==0)
            {
                sum+=remainder;
            }
            temp/=10;
        }

    return sum;
    }
    public boolean condition(int sum)
    {
      if(sum>25)
            return true;
        else
                return false;

}}

