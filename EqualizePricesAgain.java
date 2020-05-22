import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EqualizePricesAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/271/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		double queries = reader.nextDouble();
		
		for(int i =0;i<queries;i++) {
			double goods = reader.nextDouble();
			double totalSum =0;
			//calculate the total Σ of all the goods.
			for(int k=0;k<goods;k++) {
				 totalSum += reader.nextDouble();
				
			}
			//divide the total sum on the amount of goods you have and round it up.
			double answer = totalSum/goods;
			System.out.println((int) Math.ceil(answer));
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

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 
	}
}
