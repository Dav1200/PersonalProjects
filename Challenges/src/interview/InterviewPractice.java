package interview;

import java.util.HashMap;


public class InterviewPractice {

    public static void duplicates(String s) {
        HashMap<Character, Integer> check = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            if (check.containsKey(s.charAt(i))) {
                check.replace(s.charAt(i), check.get(s.charAt(i)) + 1);
            } else {
                check.put(s.charAt(i), 1);
            }
        }
        System.out.println(check);
    }

    public static void anagramCheck(String a, String b) {
        a = a.toLowerCase();

        b = b.toLowerCase();
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (a.length() != b.length()) {
            System.out.println("false");
        }
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), 1);
            map2.put(b.charAt(i), 1);

        }
        if (map.equals(map2)) {
            System.out.println("anagrams");
        } else {
            System.out.println("false");
        }
        System.out.println(map);
        System.out.println(map2);

    }


    public static void main(String[] args) {
        //duplicates("aaabbbccc");
        anagramCheck("limericks", "slick rime");

    }
}
