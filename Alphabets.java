// Question 12 of Board Journal
import java.util.Scanner;
public class Alphabets
{
    char [] chArray;
    Alphabets ()
    {
        chArray = new char [20];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the alphabets");
        for (int i = 0; i<=chArray.length-1; i++)
             chArray[i] = sc.next().charAt(0);
    }
    
    void Arrange ()
    {
        char temp;
        for (int i = 0; i<=chArray.length-2; i++)
        {
            for (int j = 0; j<=chArray.length-2; j++)
            {
                if (chArray[j] > chArray[j+1])
                {
                    temp = chArray[j];
                    chArray[j] = chArray[j+1];
                    chArray[j+1] = temp;
                }
            }
        }
        Display ();
    }
    
    void Display ()
    {
        System.out.print ("Ascending order: ");
        for (int i = 0; i<=chArray.length-1; i++)
             System.out.print (chArray[i]);
    }
    
    public static void main ()
    {
        Alphabets obj = new Alphabets ();
        obj.Initialize ();
        obj.Arrange ();
    }
}
                
                