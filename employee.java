//question number 2 of board project
public class employee
{
    String name;
    double base_salary, HRA;
    void initialize (String n, double base, double hra)
    {
        name = n;
        base_salary = base;
        HRA = hra;
    }
    void display()
    {
        System.out.println("The name of the employee is "+name);
        System.out.println("The total salary of the employee is " + (base_salary + (50*HRA)/100));
    }
    public static void main()
    {
        employee obj = new employee();
        obj.initialize ("Alicia Spencer", 125000.00, 64000.00);
        obj.display();
    }
}