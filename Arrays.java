// Question 14 of Board Project 
import java.util.Scanner;
public class Arrays
{
    double avg;
    double [] dArray;
    
    Arrays ()
    {
        dArray = new double [10];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=dArray.length-1; i++)
            dArray[i] = sc.nextDouble ();
    }
    
    void calculate ()
    {
        double sum = 0;
        
        for (int i = 0; i<=dArray.length-1; i++)
            sum = sum + dArray[i];
        
        avg = sum/10;
    }
    
    void display ()
    {
        System.out.println ("The average of the 10 elements in the array are " +avg);
        System.out.print ("Hence, the elements larger than the average of the array are:");
        for (int i = 0; i<=dArray.length-1; i++)
        {
            if (dArray[i] > avg)
                System.out.print (" " +dArray[i]+ " ");
        }
    }
    
    public static void main ()
    {
        Arrays obj = new Arrays ();
        obj.initialize ();
        obj.calculate ();
        obj.display ();
    }
}

            