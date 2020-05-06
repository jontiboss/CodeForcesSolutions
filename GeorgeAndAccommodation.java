import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/467/A
		// For more solutions check https://github.com/jontiboss
		Reader read = new Reader();
		int rooms = read.nextInt();
		int answer =0;
		for(int i=0;i<rooms;i++) {
			int occupiedSpaces = read.nextInt();
			int capacaty = read.nextInt();
			//calculate how many free spaces there are in each room, if there is 2 or more free spaces both George and Alex could
			//move in.
			if(capacaty-occupiedSpaces>=2) {
				answer++;
			}
		}
		System.out.println(answer);
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
