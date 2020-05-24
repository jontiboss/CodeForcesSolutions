import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CopyCopyCopyCopyCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/1325/B
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int tests = reader.nextInt();
		for(int i=0;i<tests;i++) {
			int nbrs = reader.nextInt();
			//The longest increasing subsequence you could make is equal to all the distinct numbers in the array.
			HashSet<Integer> set = new HashSet<Integer>();
			for(int k=0;k<nbrs;k++) {
				set.add(reader.nextInt());
			}
			System.out.println(set.size());
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
