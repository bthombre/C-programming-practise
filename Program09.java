import java.util.*;
public class Program09
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter year");
        int num1 = sobj.nextInt();
        
        if(num1%4==0)
        {
            System.out.println("Entered year is Leap year\n");
        }
        else
        {
            System.out.println("Entered year is not a Leap year\n");
        }
    
    }

}