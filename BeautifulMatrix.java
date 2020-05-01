import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/contest/263/problem/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int[][] matrix = new int[5][5];
	
		for(int i = 0;i<matrix.length;i++) {
			for(int k=0;k<matrix.length;k++) {
				matrix[i][k] = scan.nextInt();
				}
	}
		System.out.println(beautifulMatrix(matrix));
		}
	
	//Imagine a x-y coordinate plane where the point you want to reach is (2,2)
	//calculate how many steps you have to go until you reach the desired destination by calculate (|2-x1| + |2-y1|) where
	// (x1,y1) is the coordinates of the '1' in the matrix.
	public static int beautifulMatrix(int[][] matrix) {
		for(int i = 0;i<matrix.length;i++) {
			for(int k=0;k<matrix.length;k++) {
				if(matrix[i][k]>0) {
					return (int) (Math.abs(2-i)+Math.abs(2-k));
				}
			}
		}
		return 0;
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
