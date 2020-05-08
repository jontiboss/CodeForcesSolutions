import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombinationLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/540/A
		// For more solutions please check https://github.com/jontiboss
		Reader reader = new Reader();
		int sum =0;
		int n =reader.nextInt();
		String word1 = reader.next();
		String word2 = reader.next();
		
		for(int i =0;i<n;i++) {
			int diff = Math.abs(word1.charAt(i)-word2.charAt(i));
			//clockwise rotation is equal to diff and anti clockwise rotation is equal to 10-diff
			sum = sum + Math.min(diff, 10-diff);
		}
		
		System.out.println(sum);
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
	    String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
	}
}
