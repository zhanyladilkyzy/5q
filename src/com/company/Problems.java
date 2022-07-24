package com.company;

import java.util.*;

public class Problems {
//1.
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr.equals(str);
    }
//2.
    public String restoreString(String s, int[] indices) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], String.valueOf(s.charAt(i)));
        }

        TreeMap<Integer, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        String sortedS = "";
        for (Map.Entry<Integer, String> entry : sorted.entrySet())
            sortedS += entry.getValue();

        return sortedS;
    }
//3.
    public int numberOfSteps(int num) {
        int counter = 0;
        while (num > 0) {
            if(num % 2 == 0){
                num /= 2;
                counter++;
            } else {
                num -= 1;
                counter++;
                if (num == 0)
                    break;
                else {
                    num /= 2;
                    counter++;
                }
            }
        }
        return counter;
    }
//4.
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        for (String s: word1) {
            s1 += s;
        }

        for (String s: word2) {
            s2 += s;
        }
        return s1.equals(s2);
    }
//5.
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;

        // i: j is the range of a sub-array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j += 2) {
                // iterate over sub-array
                for (int k = i; k < j; k++) {
                    result += arr[k];
                }
            }
        }

        return result;
    }

}
