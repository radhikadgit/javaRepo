package com.javaPractiseQuestions;

public class AddTwoMatrixs {

	public static void main(String[] args) {
		
		int a1[][] = {{1,2},{4,8},{5,9}};
		int a2[][] = {{4,7},{6,10},{8,4}};
		
		int m=a1.length;
		int n=a2.length;
		System.out.println(m+" "+n);
		
		int sum[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n-1; j++) {
				
				sum[i][j] = a1[i][j] + a2[i][j];
				System.out.print(sum[i][j]+" ");     			
			}			
		}
//		 for(int a=0; a<m; a++) {
//			 for(int b=0; b<n; b++) {
//				 sum[a][b]=a1[a][b]+a2[a][b];
//				 System.out.println(sum+" ");
//			 }
//		 }
		
	}

}
