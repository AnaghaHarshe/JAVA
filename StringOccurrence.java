public class StringOccurrence {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Empty needle is always found at the beginning
        }

        if (haystack.length() < needle.length()) {
            return -1; // Needle cannot be found in a shorter haystack
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Found a match at index i
            }
        }

        return -1; // Needle not found
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2)); // Output: -1

        String haystack3 = "";
        String needle3 = "";
        System.out.println(strStr(haystack3, needle3)); // Output: 0

        String haystack4 = "a";
        String needle4 = "a";
        System.out.println(strStr(haystack4, needle4)); // Output: 0

        String haystack5 = "mississippi";
        String needle5 = "issip";
        System.out.println(strStr(haystack5, needle5)); // Output: 4
    }
}
