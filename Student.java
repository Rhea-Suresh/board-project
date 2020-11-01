// Question 7 of Board Project
import java.util.Scanner;
public class Student
{
    double percent, marks;
    int roll_no;
    String name;
    
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the student");
        name = sc.nextLine ();
        System.out.println ("Enter the roll number of the student");
        roll_no = sc.nextInt ();
        System.out.println ("Enter the marks scored in 5 subjects");
        marks = sc.nextDouble ();
    }
    
    void calculate ()
    {
        percent =  (marks/500)*100;
    }
    
    void allotment()
    {
        System.out.println("The name of the student is "+name);
        System.out.println ("The Roll Number of the student is "+roll_no);
        if (percent>=90)
        {
            System.out.println("The stream assigned is Science with Computers.");
        }
        else if ((percent>=80)&&(percent<=89))
        {
            System.out.println("The stream assigned is Science without Computers.");
        }
        else if ((percent>=70)&&(percent<=79))
        {
            System.out.println("The stream assigned is Commerce with Maths.");
        }
        else if ((percent>=60)&&(percent<=69))
        {
            System.out.println("The stream assigned is Commerce without Maths.");
        }
        else
        {
           System.out.println("The student is not applicable for any stream.");
        }
    }
    
    public static void main ()
    {
        Student obj = new Student ();
        obj.getData ();
        obj.calculate ();
        obj.allotment ();
    }
}
    