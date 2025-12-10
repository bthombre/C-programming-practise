import java.util.*;
public class Program13
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter limit of N");
        int N = sobj.nextInt();

        for(int i = 1; i<=100;i++)
        {
            System.out.println(N+" X "+i+" = "+i*N);
        }
    }
}
