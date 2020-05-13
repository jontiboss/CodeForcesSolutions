import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatingCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1095/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int length = reader.nextInt();
		int offset = 0;
		String wordString = reader.next();
		//Since the word is repeated 1+2+3+4.... add the offset to i and it will print the right characters
		for(int i=0;i<length;i=i+offset) {
			System.out.print(wordString.charAt(i));
			offset++;
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
