import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/41/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		StringBuilder sb = new StringBuilder(reader.next());
		String w2 = reader.next();
		//Method using stringBuilder.
		System.out.println(sb.reverse().toString().equals(w2) ? "YES" : "NO");
		
		
		
		//method w/o stringbuilder
//		String w1 = reader.next();
//		String w2 = reader.next();
		
//		boolean flag = true;
		//check if the word is reversed, if the words are not the same length, its for sure not the same.
//		for(int i =0;i<w1.length();i++) {
//			if(w1.charAt(i) != w2.charAt(w2.length()-i-1)|| w1.length()!=w2.length()) {
//				flag = false;
//				break;
//			}
//		}
//		System.out.println(flag ? "YES" : "NO");
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
