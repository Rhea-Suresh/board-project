// Question 9(a) of Board Project
public class series1
{
    int sum = 0;
    void calculate()
    {
        for(int i=2; i<=20; i+=2)
        {
           if (i % 4 != 0)
           {
             sum = sum+i;
           }
           else
           {
               sum = sum-i;
           }
        }
    }
    void display()
    {
        System.out.println("The sum is "+sum);
    }
    public static void main()
    {
        series1 obj = new series1();
        obj.calculate();
        obj.display();
    }
}
        