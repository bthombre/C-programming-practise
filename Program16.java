
import java.util.Scanner;

//Program to print even numbers from 1 to N
public class Program16
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter Limit for N");
        num = sobj.nextInt();
        System.out.println("Even Numbers from 1 to "+num+" are following:");
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }

        }
    }
}