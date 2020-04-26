import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeadPixel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1315/A
		Reader scan = new Reader();
		int testCases = scan.nextInt();
		int deadX,deadY,x,y;
		for(int i=0;i<testCases;i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			deadX = scan.nextInt();
			deadY = scan.nextInt();
			// We want to see if where the biggest area depending on if we place the window left,right,up  or down from the dead pixel
			int temp1 = Math.max(deadX,x-1-deadX)*y;
			int temp2 = Math.max(deadY,y-1-deadY)*x;
				System.out.println(Math.max(temp1,temp2));
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
