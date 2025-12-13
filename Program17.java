//Program to print fibonacci series
import java.util.Scanner;
public class Program17
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter Limit for N");
        num = sobj.nextInt();
        System.out.println("Fibonacci series : ");
        int a = 0;
        int b=1;
        for(int i=1;i<=num;i++)
        {
            System.out.println(a);
            int next = a+b;
            a=b;
            b=next;
        }
    }
}