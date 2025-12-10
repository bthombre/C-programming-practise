import java.util.*;
public class Program08
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number as num1");
        int num1 = sobj.nextInt();
        System.out.println("Enter a number as num2");
        int num2 = sobj.nextInt();
        System.out.println("Enter a number as num3");
        int num3 = sobj.nextInt();
        
        if(num1>num2)
        {
            if(num1>num3)
            {
            System.out.println("Num1 is greatest \n");
            }
        }
        else if(num2>num3)
        {
            System.out.println("Num2 is greatest\n");
        }
        else
        {
            System.out.println("Num3 is Greatest\n");
        }
    
    }

}