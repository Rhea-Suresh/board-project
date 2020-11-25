//Question 5 of Board Project
import java.util.Scanner;
public class Patterns 
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ("1. To print a triangle with numbers");
        System.out.println ("2. To print a inverted triangle with only one number");
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void Pattern1 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the rows of triangle");
        int n = sc.nextInt ();
        
        for (int i = 1; i<=n; i++)
        {
            int a = 1;
            for (int j = 1; j<=i; j++)
            {
                System.out.print (a + " ");
                a++;
            }
            System.out.println ();
        }
    }
    
    void Pattern2 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the rows of triangle");
        int r = sc.nextInt ();
        System.out.println ("Enter the number to be printed");
        int n = sc.nextInt ();
        
        for (int i = r; i>=1; i--)
        {
           for (int j = 1; j<=r; j++)
           {
               System.out.print (" " +n+ " ");
           
           }
           r--;
           System.out.println ();
        }
     }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Patterns obj = new Patterns ();
        int option;
        char choice;
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2]:");
            option = sc.nextInt ();
            
            switch (option)
            {
                case 1: obj.Pattern1 ();
                        break;
                case 2: obj.Pattern2();
                        break;
                default: return;
            }
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    }
}


        