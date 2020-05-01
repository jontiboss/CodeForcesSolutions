import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntonAndDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/734/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int n = scan.nextInt();
		int A=0,D=0;
		String gamesequence = scan.next();	
		//Counts how many wins each player got
		for(int i = 0;i<gamesequence.length();i++) {
			if(gamesequence.charAt(i) == 'A') {
				A++;
			}
			else {
				D++;
			}
		}
		//		Print the winner
		if(A>D) {
			System.out.println("Anton");
		}
		else if(A<D) {
			System.out.println("Danik");	
		}
		else {
			System.out.println("Friendship");
			
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
