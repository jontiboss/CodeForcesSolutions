import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ImBoredWithLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/822/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int x1 = reader.nextInt();
		int x2 = reader.nextInt();
		//Since we know that a factorial is 1*2*3*4....(x-1)*x we know that the GCD will be the minimum factorial of the two numbers.
		int factorial = factorial(Math.min(x1, x2));
		System.out.println(factorial);
			}
	//calculate the factorial of a number
	public static int factorial(int x) {
		if(x==1) {
			return 1;
		}
		else {
			return x*factorial(x-1);
		}
	}
	public 	static class Reader 
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
