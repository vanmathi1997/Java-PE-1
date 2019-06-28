public class OddorEven{

    public static String findoddoreven(int n) {

        if((n<=30&&n>=20)&&(n%2==0))//if condition for finding odd or even
        {
            return "Jerry";
        }
        else if((n<=30&&n>=20)&&(n%2!=0))
        {
            return "Tom";
        }
        else
        {
            return "Number is not between 20 and 30";
        }

    }
}
