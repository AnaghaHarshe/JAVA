import java.util.Scanner;
class Arithmetic
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int a,b,sum,sub,mult,div,mod;

   System.out.print("Enter 1st no: ");
   a = sc.nextInt();
   System.out.print("Enter 2nd no: ");
   b= sc.nextInt();

  sum=a+b;
  System.out.println("Addition: "+sum);
  sub=a-b;
  System.out.println("Substractin: "+sub);
  mult=a*b;
  System.out.println("Multipication: "+mult);
  div=a/b;
  System.out.println("Division: "+div);
  mod=a%b;
  System.out.println("Modulus: "+mod);

  }
}