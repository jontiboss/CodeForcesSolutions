import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/984/A
		Reader read = new Reader();
		int[] n = new int[read.nextInt()];
		for(int i=0;i<n.length;i++) {
			n[i] = read.nextInt();
		}
		//sort the array
		Arrays.sort(n);
		//If both players play optimal the expected value will be located in the middle of the array.
		// Tts located in n.length/2-1 for even arrays and n.length/2 for odd arrays.
		System.out.println((n.length & 1) == 0 ? n[n.length/2-1] : n[n.length/2]);
	}
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
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
		int nextInt() {
			return Integer.parseInt(next());
			
		}
	}
}
