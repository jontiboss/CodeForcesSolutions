import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/69/A
		Reader reader = new Reader();
		int n = reader.nextInt();	
		int sumX = 0,sumY = 0,sumZ = 0;
		// since x=y=z=0 if it is in equilibrium, we could just calculate the total sum for all axis
		// if the sums is equal to zero then it is in equilibrium, otherwise no.
		//3*0(n)
		for(int i = 0;i<n;i++) {
				sumX += reader.nextInt();
				sumY += reader.nextInt();
				sumZ += reader.nextInt();
				}
		if(sumX == 0 && sumY == 0 && sumZ == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
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
