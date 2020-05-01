import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1220/A
		// https://github.com/jontiboss
		int ones = 0,zeros = 0;
		Reader scan = new Reader();
		// Not needed but is given as a input.
		int n = scan.nextInt();
		String word = scan.next();
		byte[] wordsByte = word.getBytes();
		//search for how many r and n there is in the array, which is equal to how many zeros or ones there is.
		for(int i = 0; i<wordsByte.length;i++) {
			//If the letter is equal to 'r'
			if(wordsByte[i] == 114) {
				zeros++;
			}
			//If the letter is equal to 'n'
			if(wordsByte[i] == 110) {
				ones++;
			}
		}
		for(int k = 0;k<ones;k++) {
			System.out.print("1 ");
		}
		for(int m = 0;m<zeros;m++) {
			System.out.print("0 ");	
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
