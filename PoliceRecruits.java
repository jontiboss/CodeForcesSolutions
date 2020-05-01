import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/427/A
		// if we don't have any police's employed/free then a crime will remain unsolved otherwise we will send a police to 
		// investigate the crime.
		Reader reader = new Reader();
		int n = reader.nextInt();
		int sum =0,crime=0;
		for(int i =0;i<n;i++) {
			sum += reader.nextInt();
			if(sum<0) {
				crime++;
				sum=0;
			}
		}
		System.out.println(crime);
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
