import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Borze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/32/B
		// https://github.com/jontiboss
		Reader scan = new Reader();
		StringBuilder sb = new StringBuilder();
		byte[] word = scan.next().getBytes();
		for(int i = 0; i<word.length;i++) {
			if(word[i] == 46) {
				sb.append(0);
			}
			if(word[i]==45 && word[i+1]==46) {
				sb.append(1);
				i++;
			}
			if(word[i]==45 && word[i+1]==45) {
				sb.append(2);
				i++;
			}
		}
		System.out.println(sb.toString());
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
