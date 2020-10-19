// Board Project Question 3
public class RandomNumbers
{
    void generateNumbers ()
    {
        int n = 20;
        for (int i = 1; i<=20; i++)
        {
            int r = (int) (Math.random () * 100);
            System.out.println (r);
        }
    }
    
    public static void main ()
    {
        RandomNumbers obj = new RandomNumbers ();
        obj.generateNumbers ();
    }
}
