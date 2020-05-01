import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WrongSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem https://codeforces.com/problemset/problem/977/A
		int n,k;
		Reader scan = new Reader();
		//System.out.println("enter n");
		n = scan.nextInt();
		//System.out.println("enter k");
		k = scan.nextInt();
		
		//Subtract one k times.
		for(int i =0;i<k;i++) {
			//If the last digit of the number is zero, divide by 10.
		if(n%10 == 0) {
			n = n/10;
		}
		//If the last digit of the number is non-zero, decreases the number by one.
		else {
			n--;
		}
		
		}
		//print out the final result.
		System.out.println(n);
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
