import java.util.*;
public class Program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sobj.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is Even\n");
        }
        else
        {
            System.out.println("Number is Odd\n");
        }
    
    }

}