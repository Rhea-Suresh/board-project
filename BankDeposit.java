//Question 4 of board project
import java.util.Scanner;
public class BankDeposit 
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ("1. To apply for Term Deposit");
        System.out.println ("2. To apply for Recurring Deposit");
    }
    
    void TermDeposit ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter the Principal Amount");
        double P = sc.nextDouble ();
        System.out.println ("Enter the Rate of Interest");
        double r = sc.nextDouble ();
        System.out.println ("Enter the number of years");
        double n = sc.nextDouble ();
        
        double A = P* Math.pow((1+r/100),n);
        System.out.println("The Maturity Amount is "+A);
    }
    
    void RecurringDeposit ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter the Principal Amount");
        double P = sc.nextDouble ();
        System.out.println ("Enter the Rate of Interest");
        double r = sc.nextDouble ();
        System.out.println ("Enter the number of months");
        double n = sc.nextDouble ();
        
        double A = P*n+(P*((n*(n+1))/2)*(r/100)*(1/12));
        System.out.println("The Maturity Amount is "+A);
    }
    
        public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        BankDeposit obj = new BankDeposit ();
        int option;
        char choice;
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2]:");
            option = sc.nextInt ();
            
            switch (option)
            {
                case 1: obj.TermDeposit ();
                        break;
                case 2: obj.RecurringDeposit();
                        break;
                default: System.out.println ("Incorrect selection");
                         return;
            }
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    }
}