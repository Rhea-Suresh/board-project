// Question numner 10 (b) of Board Project
import java.util.Scanner;
public class Patterns2
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
        for (int i = 1; i<=n; i++) //Number of rows
        {
            int a = n;
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                System.out.print (" " + a );//Pattern Ingridient
                a--;
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Patterns2 obj = new Patterns2 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}