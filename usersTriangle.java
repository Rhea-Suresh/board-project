// Question 5 of Board Project
public class usersTriangle
{ 
    void triangle_number (int row) 
    {
        int n = 1;
        for (int i = 1; i<=row; i++)
        {
            for(int a = 1; a<=i; a++)
            {
                System.out.print (n+" ");
                n++;
            }
          System.out.println();
        }
    }
    
    void inverted_triangle_number (int row)
    {

        for(int i = row; i >= 1; --i) 
        {
            for(int j = 1; j <= i; ++j) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    void triangle_letters (int row)
    {
       int i,j;
       i=1;
        while(i<=row)
        {
          j=1;
           while(j<=i)
            { 
             System.out.print((char)(j+64));
             j++;
            }
          i++;
          System.out.println();
       }
    }
    void inverted_triangle_letter (int row)
    {
        int i, j;
        for (i = 1; i<=row; i++)
        {
            int ch = 65;
             for (j=i; j<=row; j++)
             { 
                System.out.print ((char)(ch-1+j) + " ");
             }
            System.out.println ();
        }
    }
}
            
     