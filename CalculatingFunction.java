import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/486/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		Long n = reader.nextLong();
		//Bitwise division by 2
		Long temp = n>>1;
		// for even numbers return n/2, for uneven numbers return (n-1)/2 -n or truncate it to n/2  - n
		System.out.println((n & 1) == 0 ? temp  : temp - n );
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

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

	}
	
}
