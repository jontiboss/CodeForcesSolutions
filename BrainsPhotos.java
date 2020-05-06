import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BrainsPhotos {
	static Reader reader;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/707/A
		// For more solutions check https://github.com/jontiboss
		reader = new Reader();
		int x = reader.nextInt();
		int y = reader.nextInt();
		solve(x,y);
	
	}
	public static void solve(int x, int y) {
		for(int i =0;i<x;i++) {
			for(int k = 0;k<y;k++) {
				char input = reader.next().charAt(0);
				//Once a color pixel occurs we know for a fact the picture is not black and white.
				//Return the answer
				if(input == 'C'|| input == 'M' || input == 'Y') {
					System.out.println("#Color");
					return;
				}
			}
		}
		System.out.println("#Black&White");
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
