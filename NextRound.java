import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/158/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader(); 
		int contestant = reader.nextInt();
		int score = reader.nextInt()-1;
		int answer = 0;
		int[] nbrs = new int[contestant];
		//save the scores
		for (int i =0;i<contestant;i++) {
			nbrs[i] = reader.nextInt();
			
			}
		//If the score is bigger than 0 and the score is bigger or equal to the score located at nbrs[score](k)
			for(int k =0;k<nbrs.length;k++) {
				if(nbrs[k]>0 && nbrs[score]<=nbrs[k]) {
					answer++;
				}
				
		}
		System.out.println(answer);
	
			
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
