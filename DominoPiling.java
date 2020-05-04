import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DominoPiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/50/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		// Find the area which is x*y, a domino is always taking up 2 spaces.
		// A even area can always be divided by 2, and odd area will have a square left empty.
		// for bigger squares the one "empty" square thats left will have a smaller impact in the total area.
		// therefore we could just truncate the decimals to an integer, to get the maximum domino its just to divide by 2.
		
		   
	    //multiply the two inputs to get the area, then bitwise divide by 2 to get the final result.
		int area = reader.nextInt()*reader.nextInt();
		System.out.println(area>>1);
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
