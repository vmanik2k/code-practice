package com.dsa.scaller.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    //Problem Description
    //Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
    //
    //The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
    //
    //Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
    //
    //
    //
    //Problem Constraints
    //0 <= sum of length of all strings <= 1000000
    //
    //
    //
    //Input Format
    //The only argument given is an array of strings A.
    //
    //
    //
    //Output Format
    //Return the longest common prefix of all strings in A.
    //
    //
    //
    //Example Input
    //Input 1:
    //
    //A = ["abcdefgh", "aefghijk", "abcefgh"]
    //Input 2:
    //
    //A = ["abab", "ab", "abcd"];
    //
    //
    //Example Output
    //Output 1:
    //
    //"a"
    //Output 2:
    //
    //"ab"
    //
    //
    //Example Explanation
    //Explanation 1:
    //
    //Longest common prefix of all the strings is "a".
    //Explanation 2:
    //
    //Longest common prefix of all the strings is "ab".

    public String longestCommonPrefix(String[] A) {
        Arrays.sort(A);
        int n = A.length-1;
        String ans = "";
        int startIndex =A[0].length();
        for(int i=0;i<startIndex;i++){
            if(!(A[0].charAt(i)==A[n].charAt(i))){
                break;
            }

            ans = ans + String.valueOf(A[0].charAt(i));
        }
        return ans;
    }
}
