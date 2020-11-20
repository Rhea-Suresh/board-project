//question number 2 of board project
import java.util.Scanner;
public class Employee
{
    float base_salary, HRA;
    
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the base salary of the employee:");
        base_salary = sc.nextFloat ();
        System.out.println ("Enter the HRA of the employee:");
        HRA = sc.nextFloat ();
    }
    
    double Salary()
    {
        double TotalSalary = (base_salary + (50*HRA)/100);
        return TotalSalary;
    }
    
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the employee:");
        String name = sc.next ();
        
        Employee obj = new Employee();
        obj.getData ();
        
        System.out.println ("The name of the employee is " +name);
        System.out.println ("The total salary of the employee is " +obj.Salary());
    }
}
