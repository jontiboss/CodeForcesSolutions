import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BusToUdayland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/711/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		String answer = "";
		int rows = reader.nextInt();
		boolean pair = false;
		
		//iterate trough all rows
		for(int i =0;i<rows;i++) {
		String row = reader.next();
		//if we already have booked a place, we don't need to do anything more than read the remaining seats.
		if(pair) {
			answer += row+"\n";
			continue;
		}
		
		
		//break up the row into two segment
		String left = row.substring(0, 2);
		String right = row.substring(2,5);
		
		//if there is two empty spots on the left side and we have not already booked seats for the friends
		if(left.contains("OO") &&  !pair) {
		 left = left.replace("OO","++");
		 pair = true;
		}
		//if there is two empty spots on the right side and we have not already booked seats for the friends
		if(right.contains("OO") &&  !pair) {
			 right = right.replace("OO","++");
			 pair = true;
			}
		//add the row back again after manipulation.
		answer += left+right+"\n";
		}
		
		
		if(pair) {
			System.out.println("YES" + "\n" + answer);
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

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 
	}
}
