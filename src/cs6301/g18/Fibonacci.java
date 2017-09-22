package cs6301.g18;

import java.math.BigInteger;

public class Fibonacci {
	static BigInteger linearFibonacci(int n) {
		BigInteger[] dp = new BigInteger[n + 1];
		dp[0] = BigInteger.valueOf(0);
		dp[1] = BigInteger.valueOf(1);
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]);
		}
		return dp[n];
	}
	
	static BigInteger logFibonacci(int n) {
		int[][] matrix = {{1, 1},{1, 0}};
		if (n == 0) {
			return BigInteger.valueOf(0);
		} 
	    power(matrix, n-1);
		return BigInteger.valueOf(matrix[0][0]);	
	}
	
	static void multiply(int F[][], int M[][]) {
		int x =  F[0][0] * M[0][0] + F[0][1] * M[1][0];
		int y =  F[0][0] * M[0][1] + F[0][1] * M[1][1];
		int z =  F[1][0] * M[0][0] + F[1][1] * M[1][0];
		int w =  F[1][0] * M[0][1] + F[1][1] * M[1][1];
     
		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
    }
    
    static void power(int F[][], int n) {
    	if( n == 0 || n == 1) {
    		return;
    	}
    		
    	int M[][] = new int[][]{{1,1},{1,0}};
      
    	power(F, n / 2);
    	multiply(F, F);
    	
    	if (n % 2 != 0) {
    		multiply(F, M);
    	}
    		
    }
	
	public static void main(String[] args) {
		BigInteger ans_1 = linearFibonacci(34);
		System.out.println(ans_1);
		BigInteger ans_2 = logFibonacci(34);
		System.out.println(ans_2);
	}
}
