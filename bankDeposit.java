//Question 4 of board project
public class bankDeposit
{
    double P, r, n, A;
    char option;
    void initialize(double Principal,double rate,double time,char opt)
    {
        P = Principal;
        r = rate;
        n = time;
        option = opt;
    }
    void calculatePrint()
    {
    switch(option)
    {
        case 'T': A = P* Math.pow((1+r/100),n);
                  System.out.println("The Maturity Amount is "+A);
                  break;
        case 'R': A = P*n+P*((n*(n+1))/2)*(r/100)*(1/12);
                  System.out.println("The Maturity Amount is "+A);
                  break;
        default: System.out.println("The entered character is invalid. Please enter 'T' for Term Deposit or 'R' for Recurring Deposit.");         
                 break;
    }
    }
    public static void main ()
    {
        bankDeposit obj = new bankDeposit();
        obj.initialize(3000,10,3,'u');
        obj.calculatePrint();
    }
}

    


            
      