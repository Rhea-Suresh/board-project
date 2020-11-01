// Question 8 of board project
public class function_overload
{
    void check (String str,char ch)
    {
        int frequency = 0;
        System.out.println ("The sentence is: "+str);
          for (int i = 0; i<str.length(); i++)
          {
              if (ch == str.charAt(i))
              {
                  ++frequency;
                }
            }
        System.out.println ("Frequency of " +ch+ " = " + frequency);
    }
    
    void check (String s1)
    {
        int i = 0;
        char ch1;
        System.out.println ("The sentence is: " +s1);
        String s2 = s1.toLowerCase ();
        System.out.println ("The vowels in the senetence are:");
        for (int j = 0; j<s2.length(); j++)
        {
            ch1 = s2.charAt(j);
            switch (ch1)
	   {
	      case 'a' :
	      case 'e' :
	      case 'i' :
	      case 'o' :
	      case 'u' :i=1;
		        System.out.println(ch1); 			 
	   }	
	}
	
	if(i==0)
	{
		System.out.println("There are no vowels in a string");
        }
     }
}      