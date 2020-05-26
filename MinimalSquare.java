import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1360/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int tests = reader.nextInt();
		for(int i =0;i<tests;i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			//you want to know if y or x is the smallest. Then you place the rectangles parallel to each other so that we could form a square.
			//the short side will be multiplied by 2 and the long side will remain the same.
			//you then want to calculate the area of the square which is area = side*side = side^2 
			System.out.println((int)Math.pow(Math.min(Math.max((x<<1), y), Math.max(x, (y<<1))),2));
				
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
