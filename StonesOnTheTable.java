import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StonesOnTheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/266/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int answer = 0;
		int n = reader.nextInt();
		String word = reader.next();
		for(int i =0;i<n-1;i++) {
			//If the same color appears after each other you have to remove it.
			if(word.charAt(i) == (word.charAt(i+1))) {
				answer++;
			}
		}
		System.out.println(answer);
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
