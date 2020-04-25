import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/978/B
			Reader read = new Reader();
			int n = read.nextInt();
			String input = read.next();
			int xs=0,temp=0;
			//Count for how many times x appears 3times after eachother.
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i) == 'x'){
					temp++;
					if(temp>=3) {
						xs++;
					}
				}
				
				else {
					temp=0;
					}
			}
			System.out.println(xs);
			
	}
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		Reader(){
			br = new BufferedReader(new InputStreamReader(System.in));
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
