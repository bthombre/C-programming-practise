//Program to find factorial of a number

import java.util.*;
public class Program19
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int fact = 1;
        int num = 0;
        System.out.println("Enter a number to fine its Factorial");
        num = sobj.nextInt();

        for(int i = 1; i<=num;i++)
        {
            fact = fact*i;

        }
        System.out.println("Factorial of "+num+" is "+fact);

    }
}