package com.design.patterns.factory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LCPractice {

        public static int lengthOfLongestSubstringBrute(String s){
                int maxLength = 0;
                if(s.length()==0)
                        return 0;
                if(s.length()==1)
                        return 1;
                for(int i=0; i < s.length(); i++){
                        for(int j=0; j < s.length(); j++){
                                if(allUnique(s, i, j)){
                                        maxLength = Math.max(maxLength, j - i +1);
                                }
                        }
                }
                return maxLength;
        }
        private static boolean allUnique(String s, int start, int end){
                boolean[] charSet = new boolean[128];
                for(int i = start; i < end; i++){
                        if(charSet[s.charAt(i)]){
                                return false;
                        }
                        charSet[s.charAt(i)] = true;
                }
                return true;
        }

        public static int lengthOfLongestSubstringUsingSet(String s){
        int maxLength = 0;
        if(s.length()==0)
                return 0;
        if(s.length()==1)
                return 1;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
           while (set.contains(s.charAt(right))){
                   set.remove(s.charAt(left));
                   left++;
           }
           set.add(s.charAt(right));
           maxLength = Math.max(maxLength, right - left +1);
        }
            return maxLength;
        }
        public static int lengthOfLongestSubstringUsingMap(String s){
                int maxlength = 0;
                int left = 0;
                Map<Character, Integer> map = new HashMap<>();
                for(int right = 0; right < s.length(); right++){
                  char currentChar = s.charAt(right);

                  if(map.containsKey(currentChar) && map.get(currentChar) >= left){
                          left = map.get(currentChar) + 1;
                  }

                  map.put(currentChar, right);
                  maxlength = Math.max(maxlength, left - right +1);
                }
                return maxlength;
        }
        public static int lengthOfLongestSubstringLC(String s) {
                int i=0;
                int j=0;
                int max=0;
                Set<Character> st = new HashSet<>();
                while(j<s.length()){
                        if(!st.contains(s.charAt(j))){
                                st.add(s.charAt(j++));
                                max=Math.max(max, st.size());
                        }
                        else{
                                st.remove(s.charAt(i++));
                        }
                }
                return max;
        }
        public static void main(String[] args) {

//            char character = 'a'; // Replace with the character you want to check
//
//            int asciiValue = character;
//
//            System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
//
//            for (char i = 'A'; i <= 'z'; i++) {
//                int ascii = (int) i;
//                System.out.println("ASCII value of " + i + " = " + ascii);
//            }
//                lengthOfLongestSubstringBrute("llladgbggm");
//                lengthOfLongestSubstringUsingSet("llladgbggm");
                System.out.println(lengthOfLongestSubstringUsingMap("llladgbggm"));
//                System.out.println(lengthOfLongestSubstringUsingMap("llladgbggm"));
//                System.out.println(lengthOfLongestSubstringLC("llladgbggm"));

        }
}
