import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VanyaAndFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/677/A
		Reader scan = new Reader();
	    int friends = scan.nextInt();
	    int height = scan.nextInt();
	    int width = 0;
	    
	    
	    for(int i=0;i<friends;i++) {
	    	//If the person needs to bend the width is incremented by 2, else 1
	    	if(scan.nextInt()>height) {
	    		width = width+2;
	    	}
	    	else {
	    		width++;
	    	}
	    }
	    System.out.println(width);
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
