import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sorting{
    /**
     * @param args
     */
    public static void main(String[] args){
        List<String>list = new ArrayList<String>();

        list.add("White");
        list.add("Green");
        list.add("Red");
        list.add("Pink");
        list.add("Purpul");
        list.add("Yellow");
       
        System.out.println("\n size:- "+list.size());
        System.out.println("\nun Sorted list-"+list.toString());

        Collections.sort(list);
        System.out.print("\nSorted list:- "+list);
        }
        
}