import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/59/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		String word= reader.next();
		int upperCase=0;
		char[] temp = word.toCharArray();
		for(int i=0;i<temp.length;i++) {
			//if the single character is an uppercase letter the ASCII code will be less than 91
			if(temp[i]<91) {
				upperCase++;
			}
			//If we know that more than half of the characters is uppercase, we don't need to check anymore.
			//this is not needed, but it saves computation time.
			if(upperCase>temp.length>>1) {
				break;
			}
		}
		//Since we know all the uppercase letters, we also know can calculate how many loweracase letters we have
		//If we have strictly more uppecase letters than lowercase we should transform the word to all uppercase, else lowercase.
		if(upperCase<=(word.length()-upperCase)) {
			System.out.println(word.toLowerCase());
		}
		else {
			System.out.println(word.toUpperCase());
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
	}
}
