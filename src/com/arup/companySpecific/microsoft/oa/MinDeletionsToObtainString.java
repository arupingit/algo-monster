package com.arup.companySpecific.microsoft.oa;

/**
 * 1821 · Min Deletions To Obtain String in Right Format
 * 
 * https://www.lintcode.com/problem/min-deletions-to-obtain-string-in-right-format/description
 * @author arupdutta
 *
 */
public class MinDeletionsToObtainString {

	public static void main(String[] args) {
		System.out.println(minSteps("YXXXYXY"));
		System.out.println(minSteps("YYXYXX"));
		System.out.println(minSteps("XXYYYY"));
	}
	
	public static int minSteps(String str){
		char[] charArr = str.toCharArray();
		int minStep = Integer.MAX_VALUE;
		for(int i=0;i<charArr.length;i++){
			int temp = minSwapsRequired(charArr, i);
			if(temp<minStep){
				minStep = temp;
			}
		}
		return minStep;
	}

	private static int minSwapsRequired(char[] charArr, int pivot){
		int LY = 0;
		int RX = 0;
		
		for(int i = pivot-1;i>=0; i--){
			if(charArr[i]=='Y'){
				LY++;
			}
		}
		for(int i = pivot+1;i<charArr.length; i++){
			if(charArr[i]=='X'){
				RX++;
			}
		}
		return LY + RX;
	}
}
