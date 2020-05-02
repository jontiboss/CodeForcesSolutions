import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NauuoAndVotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1173/A
		// https://github.com/jontiboss
		Reader read = new Reader();
		int upVote = read.nextInt();
		int downVote = read.nextInt();
		int unknown = read.nextInt();
		// Calculate how many up votes or down votes there are after subtracting. Then its just to simple cases.
		int voteRatio = upVote - downVote;
			if(voteRatio> unknown) {
				System.out.println("+");
			
		}
			else if(voteRatio< -unknown) {
				System.out.println("-");
				
			}
			else if(voteRatio== unknown && unknown ==0) {
				System.out.println("0");
				
			}
			else{
				System.out.println("?");
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
