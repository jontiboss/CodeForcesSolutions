import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoldierAndBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/546/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int firstPrice = reader.nextInt();
		int money = reader.nextInt();
		int bananas = reader.nextInt();
		//this line does the same as the code below, just written in one line instead.
		long lending = firstPrice * (bananas*(bananas+1)>>1)-money;
	
		
		//calculate the total  ∑i, using the ∑ formula n(n+1)/2 
//		int iTot = bananas*(bananas+1)>>1;
//		//compute the total price for all the bananas
//		int totalPrice = firstPrice*iTot;
//		//print how much money the soldier has to lend
//		int lending =totalPrice-money;
		if(lending<0) {
			System.out.println(0);
		}
		else {
			System.out.println(lending);
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
