public class StringArray{
    public static void main(String[] args){
        String[] array ={"Anagha", "sakshi", "aayansh", "Arohi", "Ishan", "Amita"};
        
        System.out.println("String ending with vowels: ");
        for(String str : array){
            if(isEndingWithVowel(str))
                        {
                            System.out.println(str);
                        }
                    }
                }
            
                private static boolean isEndingWithVowel(String str) {
                    String vowels = "aeiouAEIOU";
                    char lastchar = str.charAt(str.length() -1);
                    return vowels.indexOf(lastchar) !=-1;
                }
} 