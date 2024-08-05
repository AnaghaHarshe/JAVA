public class String_Methods2 {
    public static void main(String[] args) {
        String name="Anagha";

        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("a"));

        System.out.println(name.charAt(0)); 

        String modifiedName = "Anaghagha";
        System.out.println(modifiedName.indexOf("gha"));
        System.out.println(modifiedName.indexOf("gha",5));
    }
}
