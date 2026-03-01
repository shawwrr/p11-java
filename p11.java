//Wap to print the sum of first n natural numbers using while loop.
import java.util.*;
public class p11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("the sum is "+sum);

    }

}