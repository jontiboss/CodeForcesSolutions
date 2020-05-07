import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/469/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int levels = reader.nextInt();
		//Hashset has O(1) for insertion and search, it also does not add duplicate values because its a set.
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int p1 = reader.nextInt();
		//add all levels p1 can complete
		for(int i =0;i<p1;i++) {
			hs.add(reader.nextInt());
		}
		int p2 = reader.nextInt();
		//add all levels p2 can complete
		for(int k =0;k<p2;k++) {
			hs.add(reader.nextInt());
		}
		//if the two friends can complete the all levels
		if(hs.size()==levels) {
			System.out.println("I become the guy.");
		}
		else {
			System.out.println("Oh, my keyboard!");
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
