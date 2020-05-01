import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TokitsukazeAndEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1191/A
		Reader reader = new Reader();
		int x = reader.nextInt();
		// Case0=cat D,Case1=cat A,Case2=cat C,Case3=cat B,
		 switch (x%4) {
         case 0:  System.out.println(1 + " A");
                  break;
         case 1:  System.out.println(0 + " A");
                  break;
         case 2:  System.out.println(1 + " B");
                  break;
         case 3:  System.out.println(2 + " A");
                  break;
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
