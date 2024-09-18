import java.io.*;
import java.util.Scanner;
class CreateFile 

{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        File F = new File("D:\\22UAI033\\text_file.txt");
        try
        {
            if(F.createNewFile())
            {
                System.out.println("Successfully File is created");
            }
            else
            {
                System.out.println("File already exist");
            }
    
              try(FileWriter W = new FileWriter(F))
               {
                if(F.canWrite())
                {
                    System.out.println("write into file: ");
                    String s= sc.next();
                    W.write(s);
                    System.out.println("sucsessfully write into file");
                }
                else
                {
                    System.out.println("write method does not exist");
                }               
               }
               catch(IOException e)
                 {
                     System.out.println("e");
                 }
              
            if(F.canRead())
            {
                System.out.println("Use can_read method");
            }
            else
            {
                System.out.println("Read method does not exist");
            }

           if(F.delete())
            {
                System.out.println("File deleted");
            }
            else
            {
                System.out.println("file does not deleted");
            }
        }
        catch(IOException i)
        {
         System.out.println("Exception handled");
        }
        }
}
