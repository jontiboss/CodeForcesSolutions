import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/4/A
		// https://github.com/jontiboss
		Reader reader = new Reader();
		int melons = reader.nextInt();
		//special case is if melons == 2 then when we divide we will get 1, which is odd. 
		// melons&1 is bitwise division to check if a number is odd, this is faster than modulo.
		if(melons == 2 || (melons&1) == 1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES"); 
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
