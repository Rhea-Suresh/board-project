// Question 7 of Board Project
public class Student
{
    String n;
    int roll;
    double eng, hin, math, sci, comp, avg, percent;
    void initialize (String name, int roll_no, double english, double hindi, double maths, double science, double computer)
    {
        n = name;
        roll = roll_no;
        eng = english;
        hin = hindi;
        math = maths;
        sci = science;
        comp = computer;
        
    }
    
    void calculate ()
    {
        percent = ((hin + eng + sci + math + comp) * 100)/500;
    }
    
    void allotment()
    {
        System.out.println("The name of the student is "+n);
        System.out.println ("The Roll Number of the student is "+roll);
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
}
    