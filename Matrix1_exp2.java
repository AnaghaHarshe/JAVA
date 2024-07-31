import java.util.Scanner;
class Matrix
{
    
        Scanner sc=new Scanner(System.in);
        int x[][]=new int[2][2];
        int y[][]=new int[2][2];
        int i,j;

        void getarr()
        {
            System.out.println("Enter the 1st Matrix : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                x[i][j]=sc.nextInt();
            }
          }

          System.out.println("Enter the 2nd Matrix : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                y[i][j]=sc.nextInt();
            }
          }
           
          System.out.println("Enter the 1st Matrix : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(x[i][j]+" ");
            }
             System.out.println();
          }

          System.out.println("Enter the 2nd Matrix : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(y[i][j]+" ");
            }
             System.out.println();
          }
          
          

        }

        void Add()
        {
            int z[][]=new int[2][2];
            for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
            z[i][j]=x[i][j]+y[i][j];
            System.out.print(z[i][j]+" ");
            }
          }
          System.out.println();

          System.out.println("Addition of matrix is : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(z[i][j]+" ");
            }
             System.out.println();
          }
          
          
        }

        void sub()
        {
            int w[][]=new int[2][2];
            System.out.println("substraction is : ");

            for(i=0;i<2;i++)
            {
            for(j=0;j<2;j++)
            {
            w[i][j]=x[i][j]-y[i][j];
            System.out.print(w[i][j]+" ");
            }
            }
          System.out.println();

          System.out.println("Substraction of matrix is : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(w[i][j]+" ");
            }
             System.out.println();
          }         
          
        }

        void multi()
        {
            int a[][]=new int[2][2];
            System.out.println("multipliaction is : ");

            for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
            a[i][j]=x[i][j]*y[i][j];
            System.out.print(a[i][j]+" ");
            }
          }
          System.out.println();

          System.out.println("Multiplication of matrix is : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
             System.out.println();
          }
          
        }
        
        void div()
        {
            int b[][]=new int[2][2];
            System.out.println("division is : ");

            for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
            b[i][j]=x[i][j]/y[i][j];
            System.out.print(b[i][j]+" ");
            }
          }
          System.out.println();
          System.out.println("Divison of matrix is : ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
             System.out.println();
          }          
        }

}

class Matrix1
{
    public static void main(String args[])
    {
        Matrix M = new Matrix();
        M.getarr();
        M.Add();
        M.sub();
        M.multi();
        M.div();
    }
}