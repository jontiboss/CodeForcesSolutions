import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/705/A
		// https://github.com/jontiboss
		int n;
		boolean love = false;
		StringBuilder sb = new StringBuilder();
		Reader scan = new Reader();
		n = scan.nextInt();
		for(int i = 0 ; i<n;i++) {
			if(love == true) {
				if(i==n-1) {
					sb = sb.append("I love it ");	
				}

				else {
					sb = sb.append("I love that ");
					love = false;
				}
			}
			else {
				if(i==n-1) {
					sb = sb.append("I hate it ");
				}
				else {
					sb = sb.append("I hate that ");
					love = true;
				}
			}
		}
		System.out.println(sb);
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
