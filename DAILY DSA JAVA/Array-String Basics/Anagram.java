package DAILY_DSA_JAVA.Array_String_Basics;

import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String s, String t) {

        // 1. Remove spaces
        String str1 = s.replaceAll("\\s", "");
        String str2 = t.replaceAll("\\s", "");

        // 2. Convert to lowercase and char array
        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        // 3. Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // 4. Compare
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println(anagram(s, t));
    }
}