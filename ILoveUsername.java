
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/155/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int contests = reader.nextInt();
		int firstContest = reader.nextInt();
		int best =firstContest, worst=firstContest,amazing=0;
		for(int i=0;i<contests-1;i++) {
			int temp =reader.nextInt();
			if(temp<worst) {
				worst = temp;
			amazing++;
			}
			if(temp>best) {
				best = temp;
				amazing++;
			}
			
		}
		System.out.println(amazing);
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
