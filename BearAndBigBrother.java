import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BearAndBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/791/A
		// https://github.com/jontiboss
		int limak,bob,years = 0;
		Reader scan = new Reader();
	
//		System.out.println("Enter Limak's weight");
		limak = scan.nextInt();
		
//		System.out.println("Enter Bob's weight");
		bob =scan.nextInt();
		//For every year Limak's weight gets tripled and Bob's weight gets doubled.
		while(limak<=bob) {
			limak = limak*3;
			bob = bob*2;
			years++;
//			System.out.println("Bob: " + bob + "Limak: " + limak);
		}
		// Prints out how many years it takes before Limak is bigger than Bob
		System.out.println(years);
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
