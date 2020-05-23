import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FrogJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/1077/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int firstJump;
		int secondJump;
		long jumps;
		int queries = reader.nextInt();
		for(int i =0;i<queries;i++) {
			firstJump = reader.nextInt();
			secondJump = reader.nextInt();
			jumps = reader.nextInt();
			//If the jump is even the distance we will end up at is equal to (firstJump-second jump)*jumps/2, if its odd we could just add one to the jumps and add one second Jump
			// to the sum.
			// the idea will be as follow, for three jumps we will have A-B+A=2A-b and this is the same as A-B+A-B+B
			// for four jumps we will have A-B+A-B = 2A-2B = 2(A-B) the factor of two is equal to 4/2
			System.out.println((jumps&1)==0 ? (firstJump-secondJump)*(jumps>>1): (firstJump-secondJump)*((jumps+1)>>1)+secondJump);
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
		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
}
