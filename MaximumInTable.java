import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/509/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int n = scan.nextInt();
		int[][] matrix = new int[n][n];
		//Fill the first row and collon with ones
		for(int i=0;i<n;i++) {
			matrix[i][0] = 1;
			matrix[0][i] = 1;
		}
//		the remaining elements are defined by the formula a[i,k] = a[i-1][k] + a[i][k-1]. 
		for(int i =1; i<matrix.length;i++) {
			for(int k =1; k<matrix.length;k++) {
				matrix[i][k] = matrix[i-1][k]+matrix[i][k-1];
			
			}
		}
		System.out.println(matrix[n-1][n-1]);
		
		
		
	}
	static class Reader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public Reader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 
	}
}
