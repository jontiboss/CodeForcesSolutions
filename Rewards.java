import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rewards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/448/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		// we dont have to track the placement.
		int cups = reader.nextInt()+reader.nextInt()+reader.nextInt();
		int medals = reader.nextInt()+reader.nextInt()+reader.nextInt();
		int shelf = reader.nextInt();
		int shelfsNeeded = 0;
		// shelfs needed is equal to medals/10 +cups/5 + one or two shelfs if there are leftovers.
		shelfsNeeded = ((medals>>1) + cups)/5;
		if(cups%5>0) {
			shelfsNeeded++;
		}
		if(medals%10> 0) {
			shelfsNeeded++;
		}
		
		if(shelf>=shelfsNeeded) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
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
