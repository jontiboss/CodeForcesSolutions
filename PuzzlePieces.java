import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PuzzlePieces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/1345/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int tests = reader.nextInt();
		for(int i =0;i<tests;i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();		
			//if x==y and equal to two we could build a square puzzle.
			//if x or y is 1 we could just build a straight line.
			if(x==y && x==2 || x==1 || y==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
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
