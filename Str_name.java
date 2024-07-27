import java.util.Scanner;
class String_name
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Name");
        String name = s.nextLine();

        System.out.println("Hello"+name+", have a good day");

    }
}