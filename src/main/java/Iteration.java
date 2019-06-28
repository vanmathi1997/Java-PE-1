public class Iteration {
       public static String finditeration(Integer number) {
           String result="";
        for(int i=1;i<=number;i++)//for loop for n-th iteration
        {
            for(int j=1;j<=i;j++)
            {
                while(j<=i)
                {
                   result+=i+" ";
                    j=j+1;

                }
            }
        }return result;
    }
}
