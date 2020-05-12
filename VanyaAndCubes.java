import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VanyaAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/492/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int cubes = reader.nextInt();
		int levels =0;
		int sum = 0;
		while(sum<cubes) {
			//each level needs x cubes
			sum += levels*(levels+1)>>1;
		levels++;
		}
		//if we had cubes left and tried to make it to the next level, we cant complete it.
		if(sum>cubes) {
			levels--;
		}
		//total levels that could be completed
		System.out.println(levels-1);
		
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
