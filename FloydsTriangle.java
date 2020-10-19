//Question 1 of board project
import java.util.Scanner;
public class FloydsTriangle
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number or rows for the pattern");
        n = sc.nextInt ();
    }
    
    void GeneratePattern ()
    {
        int count = 0;
        for (int i = 1; i<=n; i++) //Number of rows
        {
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                count ++;
                System.out.print (" " + count );//Pattern Ingridient
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        FloydsTriangle obj = new FloydsTriangle ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        
            