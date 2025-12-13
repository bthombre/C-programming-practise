//Reverse a number 
import java.util.*;
public class Program15
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int rev = 0;
        int num = 0;

        System.out.println("Entr a number to reverse it");
        num = sobj.nextInt();

        int d = 0;
        while(num != 0)
        {
            d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        System.out.println("Reversed number: "+rev);

    }
}