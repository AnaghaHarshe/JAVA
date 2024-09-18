import java.util.Scanner;
class exp_8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int dividend,i,j;
        int divisor;
        int division;

        for(i = 0; i < 5;i++)
        {
            System.out.println("Enter the Dividend: ");
            dividend = sc.nextInt();
               
        for(j = 0; j < 5;j ++)
            {
            System.out.println("Enter the divisor: ");
            divisor = sc.nextInt();
        
        try {
            division = dividend/divisor;
            System.out.println(division);
        }
        catch(Exception e){
            System.err.println(e);
        }
     }
    }
 }
}