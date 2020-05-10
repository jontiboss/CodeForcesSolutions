import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetyaAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://github.com/jontiboss
		// For more solutions check https://github.com/jontiboss
	
		Reader reader = new Reader();
		String word1 = reader.next().toLowerCase();
		String word2 = reader.next().toLowerCase();
		if(word1.equals(word2)){
			System.out.println("0");
		}
		else if(word1.compareTo(word2)>0){
			System.out.println("1");
		}
		
		else if(word1.compareTo(word2)<0){
			System.out.println(-1);
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
