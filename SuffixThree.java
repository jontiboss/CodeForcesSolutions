import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SuffixThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1281/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int n = scan.nextInt();
		for(int i = 0; i<n; i++) {
		byte[] word = scan.next().getBytes();
		// Only need to check the to last characters to define which language that is used.
		int value = (word[word.length-1]+word[word.length-2]);
		if(value == 223) {
			System.out.println("FILIPINO");
		}
		if(value == 232) {
			System.out.println("JAPANESE");
		}
		if(value == 197) {
			System.out.println("KOREAN");
		}
			
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
