import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class InfinityGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/987/A
		// https://github.com/jontiboss/CodeForcesSolutions
		// Save the gems in a HashMap, remove the gem if we already have collected it.
		// print the absent gems.
		
		HashMap<String, String> gems = new HashMap<String, String>();
		 gems.put("purple", "Power");
		 gems.put("green", "Time");
		 gems.put("blue", "Space");
		 gems.put("orange", "Soul");
		 gems.put("red", "Reality");
		 gems.put("yellow", "Mind");
		
		Reader reader = new Reader();
		int n = reader.nextInt();
		for(int i =0;i<n;i++) {
			gems.remove(reader.next());
		}
		System.out.println(6-n);
		for(String i: gems.values()) {
		System.out.println(i);
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
