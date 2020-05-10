import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HelpfulMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/339/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		String word = reader.next();
		//Remove all the addition signs
		word = word.replace("+", "");
		char[] sum = word.toCharArray();
		//sort the numbers.
		Arrays.sort(sum);
		for(int k=0;k<word.length()-1;k++) {
			System.out.print(sum[k] +"+");
		}
		System.out.print(sum[sum.length-1]);

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
