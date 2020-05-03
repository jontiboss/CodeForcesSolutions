import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://codeforces.com/problemset/problem/71/A
		// https://github.com/jontiboss
		Reader reader = new Reader();
		int test= reader.nextInt();
		for(int i =0;i<test;i++) {
		String input = reader.next();
		//if the word is longer than 10 characters, print the first and the last character, and print how many words there are in between first and last character.
		if(input.length()>10) {
			System.out.println(input.charAt(0)+ ""+ (input.length()-2) +"" +input.charAt(input.length()-1));
		}
		else {
			System.out.println(input);
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
