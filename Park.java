// Question 8 of board project
import java.util.Scanner;
public class Park     
{
    double EntryFee, Discount, Amount;
    int Age;
    
    Park ()
    {
        EntryFee = 0.0;
        Discount = 0.0;
        Amount = 0.0;
        Age = 0;
    }
    
    void Input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the age of the person");
        Age = sc.nextInt ();
        System.out.println ("Enter the Entry Fee for the person");
        EntryFee = sc.nextDouble ();
    }
    
    void Calculate ()
    {
        
        if (Age<=12)
            Discount  = (45*EntryFee)/100;
        else if (Age>=50)
            Discount = (50*EntryFee)/100;
        else
            Discount = (10*EntryFee)/100;
        
        Amount = EntryFee - Discount;
    }
    
    void Display ()
    {
        System.out.println ("The Age of the customer is " +Age);
        System.out.println ("The Entry Fee for the customer is " +EntryFee);
        System.out.println ("The Discount for the customer is " +Discount);
        System.out.println ("The Amount to be paid by the customer is " +Amount);
    }
    
    public static void main ()
    {
        Park obj = new Park ();
        obj.Input ();
        obj.Calculate ();
        obj.Display ();
    }
}

        