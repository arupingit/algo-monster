package com.arup.companySpecific.microsoft.oa;

import java.util.Arrays;
import java.util.List;

/**
 * Max Network Rank
 * 
 * @author arupdutta
 *
 */
public class MaxNetworkRank {

	public static void main(String[] args) {
		System.out.println(maxNetworkRank(Arrays.asList(1, 2, 3, 3),Arrays.asList(2, 3, 1, 4),4));
	}
	
	public static int maxNetworkRank(List<Integer> starts, List<Integer> ends, int n) {
        int[] nodes = new int[n];
        int[][] distinct = new int[n][n];
        for(int i : starts){
        	nodes[i-1]++;
        }
        for(int i : ends){
        	nodes[i-1]++;
        }
		for(int i=0;i<n;i++){
			distinct[starts.get(i)-1][ends.get(i)-1] = 1;
			distinct[ends.get(i)-1][starts.get(i)-1] = 1;
		}
        int rank = 0;
        for(int i=0;i<n;i++){
        	for(int j = i+1;j<n;j++){
        		rank = Math.max(rank, nodes[i]+nodes[j]-distinct[i][j]);
        	}
        }
        
        return rank;
    }

}
