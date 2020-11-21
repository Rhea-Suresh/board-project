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
        System.out.print ("The elements larger than the average of the array are:");
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

            