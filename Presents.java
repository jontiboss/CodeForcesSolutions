import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/136/problem/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int[]  presents = new int[scan.nextInt()];
		int[]  presents2 = new int[presents.length];
		for(int i =0;i<presents.length;i++) {
			presents[i] = scan.nextInt();
		}
		
		//Use the inverse permutation algorithm
		for(int k =0;k<presents.length;k++) {
			 presents2[presents[k]-1] = k+1; 
		}
		for(int k =0;k<presents2.length;k++) {
			 System.out.print(presents2[k] + " "); 
		}
		
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
