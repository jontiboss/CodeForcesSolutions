import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FoxAndSnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/510/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		StringBuilder sb = new StringBuilder();
		int x = reader.nextInt();
		int y = reader.nextInt();
		boolean odd = true;
		boolean reverse = false;
		//prints all the desired lines. . and # alternating.
		for(int i =0;i<x;i++) {
			sb = new StringBuilder();
			sb.append("#");
			//print a whole line of . or #
			for(int k=0;k<y-1;k++) {
				
				if(odd) {
					sb.append("#");
				}
				
				if(!odd){
					sb.append(".");
				}
				
			}
			//toggle for making the # first or last in the dot line.
			if(!odd) {
				reverse= !reverse;
			}
			
			if(reverse) {
				sb.reverse();	
			}
			//print the line.
			System.out.println(sb.toString());
			//toggle if we should make . or # in next loop.
			odd = !odd;
			
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
