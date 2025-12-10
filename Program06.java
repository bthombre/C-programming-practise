import java.util.*;
public class Program06
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sobj.nextInt();
        if(num<0)
        {
            System.out.println("Number is Negative\n");
        }
        else if(num>0)
        {
            System.out.println("Number is Positive\n");
        }
        else
        {
            System.out.println("Number is 0 ");
        }
    
    }

}