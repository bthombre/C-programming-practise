//Addition of digits in three digit number
import java.util.*;
public class Program18
{
    public static void main(String sr[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;

        System.out.println("Enter a three digit number..");
        num = sobj.nextInt();

        int a = 0;
        int b =0;
        int c = 0;

        a = num/100;
        b = (num/10)%10;
        c = num%10;

        int sum = 0;
        sum = a+b+c;

        System.out.println("The sum of three digits in given number is: "+sum);
    }
}
