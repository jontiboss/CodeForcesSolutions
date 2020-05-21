import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChoosingTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/432/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int students = reader.nextInt();
		int sameTeam = reader.nextInt();
		int answer=0;
		for(int i =0;i<students;i++) {
			int temp = reader.nextInt();
			//count how many students that could be in the same team that the coach desired.
			if(5-temp>=sameTeam) {
				answer++;
			}
		}
		//divide by three to see how many teams he could form.
	System.out.println(answer/3);
		
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
