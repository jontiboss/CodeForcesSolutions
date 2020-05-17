import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/344/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int magnets = reader.nextInt();
		int groups=1;
		String magnet1 = reader.next();
		for(int i =1;i<magnets;i++) {
			String temp = reader.next();
			//check if the magnets repel.
			if(magnet1.charAt(1)==temp.charAt(0)) {
				magnet1=temp;
				groups++;
			}
			
		}
		System.out.println(groups);
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
