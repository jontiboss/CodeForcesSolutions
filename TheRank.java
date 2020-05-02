import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1017/A
		// https://github.com/jontiboss
		Reader reader = new Reader();
		int students = reader.nextInt();
		int thomasSum=0,tempSum=0,rank=1;
		//save Thomas score and compare it to the other students, if Thomas score is lower than another student, he moves down a rank.
		thomasSum = reader.nextInt()+reader.nextInt()+reader.nextInt()+reader.nextInt();
		for(int i=0;i<students-1;i++) {
			tempSum = reader.nextInt()+reader.nextInt()+reader.nextInt()+reader.nextInt();
			if(thomasSum<tempSum) {
				rank++;
			}
		}
		System.out.println(rank);
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
