import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnotherOneBitesTheDust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1148/A
		// https://github.com/jontiboss
		
		//Since  [1<=a.b.c<=10⁹] a,c,b could be bigger than 2³¹, therefore we have to use an long instead of an integer.
		//Since C is equal to "ab" we always want to use all of them, then we add a and b so many times we could after.
		//We would like to calculate the total sum of the string we could form.
		Reader reader = new Reader();
		Long a = reader.nextLong();
		Long  b = reader.nextLong();
		//bit shift is faster than multiply by 2
		Long c = reader.nextLong()<<1;
		//If the difference between b and a is bigger or equal to two, we don't have any use of the extra b's and the maximum
		//String we could form is therefore a+1. The same rule apply for a.
		if(b-a >=2) {
			b = a+1;
		}
		if(a-b >=2) {
			a =b+1;
		}
		System.out.println(c+b+a);
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
		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
}
