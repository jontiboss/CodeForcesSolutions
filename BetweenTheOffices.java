import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BetweenTheOffices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/867/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int f=0,s=0;
		// Not used.
		int n = scan.nextInt();
		byte[] flights = scan.next().getBytes();
		for(int i=1;i<flights.length;i++) {
			
			
			if(flights[i] == 70 && (flights[i-1] != flights[i])) {
			f++;
		
		}
			if(flights[i] == 83 && (flights[i-1] != flights[i])) {
				s++;
			}
		}
			if(s<f){
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
