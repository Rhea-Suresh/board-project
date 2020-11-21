// Question 15 of Board Journal
import java.util.Scanner;
public class Arrays2
{
    int [] AW;
    
    Arrays2 ()
    {
        AW = new int [8];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=AW.length-1; i++)
            AW[i] = sc.nextInt ();
    }
    
    int compute (int a)
    {
        int count = 0;
        if (a%10 == 3)
           count ++;
        return count;
    }
    
    void display ()
    {
        System.out.print ("The elements of the array with 3 at the units place are:");
        for (int i = 0; i<=AW.length-1; i++)
        {
            if (compute(AW[i])>0)
                System.out.print (" " +AW[i]+ " ");
        }
    }
    
    public static void main ()
    {
        Arrays2 obj = new Arrays2 ();
        obj.initialize ();
        obj.display ();
    }
}
