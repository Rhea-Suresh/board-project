//Question 6 of Board Project
import java.util.Scanner;
public class LongestWord
{
    String str;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the String:");
        str = sc.nextLine ();
    }
    
    void ExtractLongestWord ()
    {
        str = str + "";// Adding a space at the end, to extract the last word
        int len = str.length ();//Finding the length of the string
        String x = ""; 
        String maxw = "";
        char ch;
        int maxl = 0; 
        int p;
        for (int i = 0; i<len; i++)
        {
            ch = str.charAt (i);//extracting characters of the string one at a time
            if (ch!= ' ')
            {
                x = x + ch; // adding characters to form a word if space is not there
            }
            else
            {
                p = x.length ();
                if (p >= maxl)//checking for maximum length
                {
                    maxl = p;
                    maxw = x;
                }
                x = ""; // emptying the temporary variable to store next word
            }
        }
        System.out.println ("The longest word in the string is " +maxw);
    }
    
    public static void main ()
    {
        LongestWord obj = new LongestWord ();
        obj.getData ();
        obj.ExtractLongestWord ();
    }
}



            
        