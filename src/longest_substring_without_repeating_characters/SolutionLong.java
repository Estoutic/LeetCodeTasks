package longest_substring_without_repeating_characters;

import java.util.ArrayList;

public class SolutionLong {

    public void main(){
      System.out.println(lengthOfLongestSubstring("aab"));

    }

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 1){
            return 1;
        }
        String[] splitString = s.split("");
        ArrayList<String> stringArrayList = new ArrayList<>();
        StringBuilder string = new StringBuilder();
        ArrayList<String> stringAlphabet = new ArrayList<>();
        int maxEl,startIndex = 0;

        System.out.println(s.length());
        for (int i = 0; i < splitString.length; i ++) {
            String value = splitString[i];
            if (stringAlphabet.size() == 0) {
                string.append(value);
                stringAlphabet.add(value);
                startIndex = i;
            } else if (!stringAlphabet.contains(value)) {
                string.append(value);
                stringAlphabet.add(value);
                if(i == splitString.length - 1){
                    stringArrayList.add(string.toString());
                }
            } else {
                stringArrayList.add(string.toString());
                string = new StringBuilder();
                stringAlphabet.clear();
                if((startIndex + 1 ) < splitString.length) {
                    i = startIndex;
                }
            }
        }
        if(stringArrayList.size() != 0) {
            maxEl = stringArrayList.get(0).length();

            for (String el : stringArrayList) {
                if (el.length() > maxEl) {
                    maxEl = el.length();
                }
            }
            return maxEl;
        }
        return 0;
    }
}
