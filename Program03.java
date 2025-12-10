import java.util.*;
public class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1 = sobj.nextInt();
        System.out.println("Enter first number");
        int num2 = sobj.nextInt();

        int sum = 0;
        sum = num1+num2;

        System.out.println("The addition is: "+sum);
    
    }

}