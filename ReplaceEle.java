import java.util.ArrayList;
import java.util.List;

public class ReplaceEle{
    public static void main(String[] args){
    List<String> list = new ArrayList<String>();

    list.add("Amita");
    list.add("Ankita");
    list.add("Sanchita");
    list.add("Sumedha");
    list.add("Prachi");

    System.out.print("\nList of elements: -"+list.toString());
    int index =1;
    String e1 = list.get(index);
        System.out.println("\nEle: "+e1);

    String newElement ="Anagha";
    if(list.size() >= 2){
        list.set(1, newElement);
    }
    else{
        System.out.println("Array List has less than 2 elements");
    }
    System.out.print("\nList of elements: -"+list.toString());
}

}