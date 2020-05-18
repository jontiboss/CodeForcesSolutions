import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AmusingJoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/141/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		char[] w1 = (reader.next() + reader.next()).toCharArray();
		char[] w2 = reader.next().toCharArray();
		//sort both strings, then we can check if they are equal or not.
		Arrays.sort(w1);
		Arrays.sort(w2);
		System.out.println(Arrays.equals(w1,w2) ? "YES":"NO");
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
