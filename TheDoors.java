import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheDoors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1143/A
		// https://github.com/jontiboss
		//To solve this problem you only need to remember the last time a door from either side is occurring.
		Reader reader = new Reader();
		int doors = reader.nextInt();
		int lastLeft = 0, lastRight = 0;
		for(int i=0;i<doors;i++) {
			int temp =reader.nextInt();
			//saves the position of the last occurring door. 
			if(temp==1) {
				lastLeft = i;
			}
			else {
				lastRight  = i;
			}
			
		}
		//the smallest value here is the fastest way for you to escape, and you have to add one to the solution to compensate for
		// i starting at 0, [0<=i<doors]
		if(lastLeft<lastRight) {
			System.out.println(lastLeft+1);
		}
		else {
			System.out.println(lastRight+1);
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
