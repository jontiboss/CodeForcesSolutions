import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/702/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int numbers = reader.nextInt();
		int currentLength =0,max=0,maxLength=0;
		for(int i =0;i<numbers;i++) {
			int temp = reader.nextInt();
			
			//if the numbers keep increasing
			if(max<temp) {
				currentLength++;
				max=temp;
			}
			//if the number is lower than the previous number.
			else {
				currentLength = 1;
				max=temp;
			}
			//if the new subarray is longer than the previous longest subarray.
			if(currentLength>maxLength) {
				maxLength=currentLength;
			}
			
		}
		System.out.println(maxLength);
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
