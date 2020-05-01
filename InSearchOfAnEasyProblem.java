import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1030/A
		// https://github.com/jontiboss
		int n,k;
		boolean isEasy = true;
		//System.out.println("Enter n participants");
		Reader scan = new Reader();
		n = scan.nextInt();
		//Go trough all the participants opinions.
		for(int i = 0; i < n;i++) {
			//System.out.println("Enter 1 if the question is hard, else zero");
			k= scan.nextInt();
			//If someone thinks the question is too hard, then break and return that the question is too hard.
			if(k == 1) {
				isEasy = false;
				break;
			}
			
		}
		//Print the answer.
		if(isEasy == true) {
			System.out.println("EASY");
		}
		else {
			System.out.println("HARD");
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
