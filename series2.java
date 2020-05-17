// Question 9(b) of Board Project
public class series2
{
    int x;
    double sum = 0;
    void input (int x1)
    {
        x = x1;
    }
    void calculate ()
    {
        for (int i = 2; i<=20; i+=3)
        {
            sum = sum + x/i;
        }
    }
    void display ()
    {
        System.out.println ("The sum of the series is" +sum);
    }
}