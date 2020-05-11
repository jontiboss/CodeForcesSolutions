import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/116/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int stops = reader.nextInt();
		int currentPassangers=0,maxPassangers=0;
		for(int i =0;i<stops;i++) {
			//It leaves x people at each stop and then there enter y new people.
			currentPassangers += -reader.nextInt()+reader.nextInt();
			//Calculate the maximum people in a tram for the whole trip.
			if(currentPassangers>maxPassangers) {
				maxPassangers = currentPassangers;
			}
		}
		System.out.println(maxPassangers);
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
