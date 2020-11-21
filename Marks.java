// Question 11 of Board Project
import java.util.Scanner;
public class Marks
{
    int [] Rollno, Phy, Chem, Bio;
    String [] Names;
    int n;
    double avg;
    
    Marks ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of students (n)");
        n = sc.nextInt ();
        
        Rollno = new int [n];
        Phy = new int [n];
        Chem = new int [n];
        Bio = new int [n];
        Names = new String [n];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter the names of students");
        for (int i = 0; i<=Names.length-1; i++)
            Names [i] = sc.next ();
            
        System.out.println ("Enter the roll numbers of the students");
        for (int i = 0; i<=Rollno.length-1; i++)
             Rollno [i] = sc.nextInt ();
             
        System.out.println ("Enter the marks of the students in biology");
        for (int i = 0; i<=Bio.length-1; i++)
             Bio [i] = sc.nextInt ();
             
        System.out.println ("Enter the marks of the students in chemistry");
        for (int i = 0; i<=Rollno.length-1; i++)
             Chem [i] = sc.nextInt ();
             
        System.out.println ("Enter the marks of the students in physics");
        for (int i = 0; i<=Rollno.length-1; i++)
             Phy [i] = sc.nextInt ();
    }
    
    void Calculate ()
    {
        
        for (int i = 0; i<=Names.length-1; i++)
        {
            double total = (Bio[i] + Chem[i] + Phy[i]);
            avg = total/3;
            System.out.println ("The average marks of " +Names[i]+ " is " +avg);
            
            if ((avg>=85) && (avg<=100))
                System.out.println ("Excellent");
            else if ((avg>=75) && (avg<85))
                System.out.println ("Distinction");
            else if ((avg>=60) && (avg<75))
                System.out.println ("First Class");
            else if ((avg>=40) && (avg<60))
                System.out.println ("Pass");
            else
                System.out.println ("Poor");
                
        }
    }
    
    public static void main ()
    {
        Marks obj = new Marks ();
        obj.Initialize ();
        obj.Calculate ();
    }
}

            
             
        
    
        