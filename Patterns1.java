// Question 10 (a) of Board Project
import java.util.Scanner;
public class Patterns1
{
    int num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows in the series");
        num = sc.nextInt ();
    }
    
    void generatePattern ()
    {
        int n = num;
        for (int i = 1; i<=n; i++)
        {
            System.out.print (i);
            for (int j = 1; j<=i; j++)
            {
                    if (j%2 != 0)
                        System.out.print (" *");
                    else 
                        System.out.print (" #");
            }
            System.out.println ();
        }
    }
    
    public static void main ()
    {
        Patterns1 obj = new Patterns1 ();
        obj.getData ();
        obj.generatePattern ();
    }
}
