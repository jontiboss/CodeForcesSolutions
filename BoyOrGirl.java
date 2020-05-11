import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/236/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		char[] username = reader.next().toCharArray();
		HashSet<Character> letter = new HashSet<Character>();
		//add distinct characters to a set.
		for(int i=0;i<username.length;i++) {
			letter.add(username[i]);
		}
		//if the characters are even or odd, print the answer.
		System.out.println((letter.size()&1)==0 ? "CHAT WITH HER!" : "IGNORE HIM!");
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
