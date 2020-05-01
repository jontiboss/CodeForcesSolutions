import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LoveA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1146/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int a = 0;
		
		byte[] word = scan.next().getBytes();
		//Checks the string input for how many a's there is
		for(int i = 0; i<word.length;i++) {
			if(word[i] == 97) {
				a++;
			}
			
		}
		int remaningLetters = word.length-a;
		//Remove a letter until the majority of the letters is a's.
		while(a<=remaningLetters) {
			remaningLetters--;
		}
		
		System.out.println(a+remaningLetters);
			
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
