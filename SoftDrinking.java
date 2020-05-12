import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoftDrinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/151/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int friends = reader.nextInt();
		int bottles = reader.nextInt();
		int bottleSize = reader.nextInt();
		int limes = reader.nextInt();
		int slices = reader.nextInt();
		int salt = reader.nextInt();
		int volumeReq = reader.nextInt();
		int saltReq = reader.nextInt();
		//calculate the amount of each ingredient thats needed for each friend.
		int drinksPerFriend = (bottles*bottleSize)/(volumeReq*friends);
		int totalSlices = (limes*slices)/friends;
		int saltToasts = salt/(saltReq*friends);
		//calculate the maximum drinks the friends could make.
		System.out.println(Math.min(drinksPerFriend,Math.min(saltToasts, totalSlices)));
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
