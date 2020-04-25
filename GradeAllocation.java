import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GradeAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1316/A
		Reader scan = new Reader();
		int tests = scan.nextInt();
		int maxScore,nbrStudents;
		
		
		for(int i=0;i<tests;i++) {
			nbrStudents = scan.nextInt();
			maxScore = scan.nextInt();
			
			int grades = 0;
			//Since we want to maximize our score we only need to check for the maximum score.
			//if the sum of the grades is smaller than the maxscore just print grades, else maxscore.
			for(int k=0;k<nbrStudents;k++) {
				grades += scan.nextInt();
			}
			if(grades>maxScore) {
				System.out.println(maxScore);
			}
			else System.out.println(grades);
			
		}
	}
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		Reader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next(){
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
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
