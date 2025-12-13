//Reverse a number 
import java.util.*;
public class Program20
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int rnum = 0;
        int num = 0;

        System.out.println("Entr a number to reverse it");
        num = sobj.nextInt();

        int d = 0;
        while(num != 0)
        {
            d = num%10;
            rnum = rnum*10+d;
            num = num/10;
        }
        if(rnum==num)
        {
            System.out.println("Given number is palindrome.."+rnum);
        }
        else
        {
            System.out.println("Given number is not palindrome.."+rnum);
        }

    }
}