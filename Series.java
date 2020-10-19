// Question 9 of Board Project
import java.util.Scanner;
public class Series
{
    
    void series ()
    {
        int sum = 0;
        for(int i=2; i<=20; i+=2)
        {
           if (i % 4 != 0)
           {
             sum = sum+i;
           }
           else
           {
               sum = sum-i;
           }
        }
        System.out.println("The sum is "+sum);
    }
    
    void series (int x)
    {
        int sum = 0;
        
        for (int i = 2; i<=20; i=i+3)
        {
            sum = sum + x/i;
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
}
        