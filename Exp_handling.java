import java.util.*;

class Exp_handling{
    public static void main(String[] args){

        System.out.println("\nThe program is Started");
        int a = 10, b = 0, c;  //Exeption is occur
        try 
        {
        c= a/b;
        System.out.println("\n" +c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("\nThe program is Ended");
    }
}