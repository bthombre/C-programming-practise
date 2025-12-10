import java.util.*;
public class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sobj.nextInt();

        int sq=0;
        sq = num*num;
        System.out.println("The square of "+num+" is: "+sq);
    
    }

}