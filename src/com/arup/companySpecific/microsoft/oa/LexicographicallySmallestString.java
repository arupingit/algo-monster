package com.arup.companySpecific.microsoft.oa;

/**
 * https://algo.monster/problems/lexicographically_smallest_string
 * 
 * @author arupdutta
 *
 */
public class LexicographicallySmallestString {

	public static void main(String[] args) {
		System.out.println(smallestString("abczd"));
	}
	
	public static String smallestString(String s) {
		int i=0;
        for(;i<s.length()-1;i++){
        	if(s.charAt(i)>s.charAt(i+1)){
        		break;
        	}
        }
        return s.substring(0, i) + s.substring(i+1);
    }
}
