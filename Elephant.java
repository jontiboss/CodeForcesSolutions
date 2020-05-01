import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/617/problem/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int reminder = scan.nextInt();
		int steps = 0;
		
		// Always choose the maximum distance you are able to walk, then count how many times you can do it.
		// Example: 12/5 = 2 + the reminder 3
		// 3/3 = 1 + the reminder 0
		// reminder = 0, done
		// the minimum times you have to move until you reach 12 is 3
		if(reminder>=5) {
			steps = steps + reminder/5;
			reminder = reminder%5;
		}
		if(reminder==4) {
			steps = steps + reminder/4;
			reminder = reminder%4;
		}
		if(reminder==3) {
			steps = steps + reminder/3;
			reminder = reminder%3;
		}
		if(reminder==2) {
			steps = steps + reminder/2;
			reminder = reminder%2;

		}
		if(reminder==1) {
			steps = steps + reminder/1;
			reminder = reminder%1;
		}

		System.out.println(steps);
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
