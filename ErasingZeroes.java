import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ErasingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1303/A
		Reader scan = new Reader();
		int tests = scan.nextInt();
		boolean flag = false;
		String input;
		for(int j=0;j<tests;j++) {
			int sum=0;
			int first=0,last=0;
			input = scan.nextLine();
			//find the position of the first one and the position of the last one from the input
			//save those positions
			for(int i=0;i<input.length();i++) {
				// 49 is the ascii representation for 1
				if(!flag && input.charAt(i) == 49) {
					first = i;
					flag=true;
				}
				//save the position from the last one
				if(input.charAt(i)==49) {
					last = i;
				}
			}
		
			//delete all zeros from first to last
			for(int k=first;k<last;k++) {
				if(input.charAt(k) == 48)
					sum++;
			}
			System.out.println(sum);
			flag=false;
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
		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}
}
