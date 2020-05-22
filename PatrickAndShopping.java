import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PatrickAndShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/599/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int d1 = reader.nextInt();
		int d2 = reader.nextInt();
		int d3 = reader.nextInt();
		//the shortest path you will have to walk there will be 4 scenarios.
		// the first three scenarios you have to multiply the distance by two since you have to count for the way back.
		// 1: d1->d2
		// 2: d2->d3
		// 3: d1->d3
		// 4: d1->d2->d3
			System.out.println(Math.min(Math.min(d1+d2, Math.min(d2+d3, d1+d3))<<1,((d1+d2+d3))));
		
		
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
