import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreePilesOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/1196/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int queries = reader.nextInt();
		for(int i=0;i<queries;i++) {
			System.out.println((reader.nextLong()+reader.nextLong()+reader.nextLong())>>1);
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
		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
	
}
