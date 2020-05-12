import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheNewYearMeetingFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/723/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int x1 = reader.nextInt();
		int x2 = reader.nextInt();
		int x3 = reader.nextInt();
		//calculate the outer endpoints
		int max = Math.max(x1, Math.max(x2, x3));
		int min = Math.min(x1, Math.min(x2, x3));
		//the minimum distance the friends have to travel is |max-min| but since the coordinates cant be negative
		//you could just calculate max-min.
		int distance = (max-min);
		System.out.println(distance);
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
