//Question 1 of board project
public class FloydsTriangle
{
    int row;// row is a variable to store the number of rows 
    void initialize (int r)
    {
        row = r; 
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
}
            