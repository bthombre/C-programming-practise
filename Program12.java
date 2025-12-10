import java.util.*;
public class Program12
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter limit of N");
        int N = sobj.nextInt();

        int sum = 0;

        for(int i = 1; i<=N; i++)
        {
            sum = i+sum;
        }
        
            System.out.println("sum is "+sum);
    }
}