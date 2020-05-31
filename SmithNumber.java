// Question 18 of Board Project
public class SmithNumber
{
    int num;
    int sum1 = 0;
    int sum2 = 0;
    
    void initialize (int n)
    {
      num = n;
    }
    
    void primeFactor()
    {
        int t1 = num;
        for (int i = 2; i<=t1; i++)
        {
            while (t1%i!=0)
            {
               int a = i, count = 0, x;
                for (x = 2; x<a; x++)
                {
                    if (i%a == 0)
                    {
                      count++;
                    }
                }
                if (count == 0)
                {
                   int b = a;
                    while (b!=0)
                   { 
                     sum1 = sum1+b;
                     b = b/10;
                   }
                }
               t1 = t1/a;
            }  
        }
    }
    
    void sumDigits ()
    {
        int T1 = num, len = 0;
        while (T1!=0)
        {
            T1 = T1/10;
            len = len +1;
        }
        int t2 = num, a,s = 0;
        while (t2!=0)
        {
            a = t2%10;
            sum2 = sum2 + a;
            t2 = t2/10;
        }
    }
    void display ()
    {
      if (sum1==sum2)
      {
          System.out.println (num+" is a Smith Number.");
      }
      else
      {
          System.out.println (num+" is not a Smith Number.");
      }
    }
}

        
            
        
    