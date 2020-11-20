// Question 9 of Board Project
import java.util.Scanner;
public class Series
{
    
    void series1 ()
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
        
        System.out.println("The sum of the first series is "+sum);
    }
    
    void series2 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of x for the second series:");
        int x = sc.nextInt ();
        int sum = 0;
        
        for (int i = 2; i<=20; i=i+3)
        {
            sum = sum + x/i;
        }
        
        System.out.println ("The sum of the second series is " +sum);
    }
    
    public static void main ()
    {
        Series obj = new Series ();
        obj.series1 ();
        obj.series2 ();
    }
}
        