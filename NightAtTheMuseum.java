import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NightAtTheMuseum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/731/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		//set the starting point to a
		char[] word = ('a' +reader.next()).toCharArray();
		int sum = 0;
		int distance;
		for(int i =1;i<word.length;i++) {
			
			distance = Math.abs(word[i-1]-word[i]);
			//clockwise, anti clockwise distance
			sum += Math.min(distance,26-distance);
		}

		System.out.println(sum);
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
	}
}
