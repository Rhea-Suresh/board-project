// Board Project Question 3
public class RandomNumbers
{
    void generateNumbers ()
    {
        System.out.println ("The twenty random numbers from 1-100 are:");
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
