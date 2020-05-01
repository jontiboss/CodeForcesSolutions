import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HolidayOfEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/758/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int n = scan.nextInt();
		int[] sum = new int[n];
		int max = 0;
		// save all the cities in an array and find out what is the largest city because we want to find the smallest difference, to get a cheap price.
		for(int i=0;i<sum.length;i++) {
			int temp = scan.nextInt();
			sum[i] = temp;
			if(temp>max)
			max = temp;

		}
		int answer = 0;
		// the cheapest price is the total difference  of max-sum[k]
		for(int k = 0;k<sum.length;k++) {
			answer = answer + Math.abs(max-sum[k]);
		}
			
				System.out.println(answer);
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
