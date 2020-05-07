import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem 
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		HashSet<Character> hs = new HashSet<Character>();
		int n = reader.nextInt();
		char[] word = reader.next().toUpperCase().toCharArray();
		//add all the unique characters into a hashSet.
		for(int i=0;i<n;i++) {
			if(n<26) {
				break;
			}
			hs.add(word[i]);	
		}
		//if the size of the hashmap is 27, then all latin letters are there.
		if(hs.size()==26) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
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
