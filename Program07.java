import java.util.*;
public class Program07
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number as num1");
        int num1 = sobj.nextInt();
        System.out.println("Enter a number as num2");
        int num2 = sobj.nextInt();
        if(num1>num2)
        {
            System.out.println("Num1 is greater than num2 \n");
        }
        else
        {
            System.out.println("Num2 is greater than num1\n");
        }
    
    }

}