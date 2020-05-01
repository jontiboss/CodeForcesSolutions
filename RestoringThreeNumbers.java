import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RestoringThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1154/A
		// https://github.com/jontiboss
		Long tempX4;
		Long[] nbrs = new Long[4];
		Reader scan = new Reader();
		nbrs[0] = scan.nextLong();
		nbrs[1] = scan.nextLong();
		nbrs[2] = scan.nextLong();
		nbrs[3] = scan.nextLong();
		//solving using equation system
		//		a+b=x1,
		//		a+b=x2
		//		b+c=x3
		//		a+b+c=x4
		// 		3a+3b+3c=(x1+x2+x3+x4)
		// 		a+b+c=x4=(x1+x2+x3+x4)/3
		//		Solve rest equations using x4
		tempX4 = (nbrs[0]+nbrs[1]+nbrs[2]+nbrs[3])/3;

		for(int i =0; i<nbrs.length;i++) {
			if((tempX4-nbrs[i])>0) {
				System.out.println(tempX4-nbrs[i]);
			}
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
		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
	
}
