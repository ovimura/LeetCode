package LetterCombinationOfAPhoneNumber;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> pad = new HashMap<>();
        pad.put(2, "abc");
        pad.put(3, "def");
        pad.put(4, "ghi");
        pad.put(5, "jkl");
        pad.put(6, "mno");
        pad.put(7, "pqrs");
        pad.put(8, "tuv");
        pad.put(9, "wxyz");
        List<String> combinations = new ArrayList<>();
        if(digits.length() == 0)
            return combinations;
        char[] cs = digits.toCharArray();
        List<String> lettersGrp = new ArrayList();
        for(char c: cs){
            lettersGrp.add(pad.get(Character.getNumericValue(c)));
        }
        char[] a;
        char[] b;
        for (int ii=0; ii<lettersGrp.size(); ii++) {
            for(int jj=ii+1; jj<lettersGrp.size(); jj++) {
                if (lettersGrp.size() == 1) {
                    a = lettersGrp.get(0).toCharArray();
                    b = new char[]{};
                } else {
                    a = lettersGrp.get(ii).toCharArray();
                    b = lettersGrp.get(jj).toCharArray();
                }
                String str = "";
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < b.length; j++) {
                        str = Character.toString(a[i]) + Character.toString(b[j]);
                        combinations.add(str);
                    }
                    if (b.length == 0)
                        combinations.add(Character.toString(a[i]));
                }
            }
        }
        return combinations;
    }
}

//
//    // Function to return a vector that contains
//    // all the generated letter combinations
//    static ArrayList<String> letterCombinationsUtil(int[] number, int n,
//                                                    String[] table)
//    {
//        // To store the generated letter combinations
//        ArrayList<String> list = new ArrayList<>();
//
//        Queue<String> q = new LinkedList<>();
//        q.add("");
//
//        while(!q.isEmpty())
//        {
//            String s = q.remove();
//
//            // If complete word is generated
//            // push it in the list
//            if (s.length() == n)
//                list.add(s);
//            else
//            {
//                String val = table[number[s.length()]];
//                for (int i = 0; i < val.length(); i++)
//                {
//                    q.add(s + val.charAt(i));
//                }
//            }
//        }
//        return list;
//    }
//
//    // Function that creates the mapping and
//    // calls letterCombinationsUtil
//    static void letterCombinations(int[] number, int n)
//    {
//        // table[i] stores all characters that
//        // corresponds to ith digit in phone
//        String[] table = { "", "", "abc", "def", "ghi", "jkl",
//                "mno", "pqrs", "tuv", "wxyz" };
//
//        ArrayList<String> list =
//                letterCombinationsUtil(number, n, table);
//
//        // Print the contents of the list
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.print(list.get(i) + " ");
//        }
//    }