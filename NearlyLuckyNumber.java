import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NearlyLuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/110/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		String nbrs =reader.next();
		int lucky =0;
		for(int i =0;i<nbrs.length();i++) {
			if(nbrs.charAt(i) == '4'||nbrs.charAt(i) == '7') {
				lucky++;
			}
			
		}
		
		if(lucky ==4 || lucky == 7) {
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
	}
}
