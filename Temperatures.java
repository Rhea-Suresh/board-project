// Question 13 of Board Journal
import java.util.Scanner;
public class Temperatures
{
    double [] tempArray;
    
    Temperatures ()
    {
        tempArray = new double [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the temperatures for five cities");
        
        for (int i = 0; i<=tempArray.length-1; i++)
             tempArray [i] = sc.nextDouble ();
    }
    
    void arrange ()
    {
        double temp;
        for (int i = 0; i<=tempArray.length-2; i++)
        {
            for (int j = 0; j<=tempArray.length-2; j++)
            {
                if (tempArray[j] > tempArray[j+1])
                {
                    temp = tempArray[j];
                    tempArray[j] = tempArray[j+1];
                    tempArray[j+1] = temp;
                }
            }
        }
        display ();
    }
    
    void display ()
    {
        System.out.print ("The temperature of the five cities in ascending order are:");
        for (int i = 0; i<=tempArray.length-1; i++)
             System.out.print (" " +tempArray[i]+ " ");
    }
    
    public static void main ()
    {
        Temperatures obj = new Temperatures ();
        obj.initialize ();
        obj.arrange ();
    }
}
