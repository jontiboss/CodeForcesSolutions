import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PashmakAndGarden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/459/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int x2= reader.nextInt();
		int y2= reader.nextInt();
		int distance;
		//		Square
		//		  CD
		//                AB
		
		//in the explanation we assume that A is located at origin (0,0)
		
		//if x1=x2 then we know that we got the points A and C, then we could find B and D
		//by adding the distance between A and C to the x coordinate.
		if(x1==x2) {
			distance = Math.abs(y1-y2);
			x1 += distance;
			x2 += distance;
			System.out.println(x1+" " + y1 + " " + x2 + " " + y2);
		}
		//if y1=y2 then we know that we got the points A and B, then we could find D and B
		//by adding the distance between A and B to the y coordinate.
		else if(y1==y2) {
			distance = Math.abs(x1-x2);
			y1 += distance;
			y2 += distance;
			System.out.println(x1+" " + y1 + " " + x2 + " " + y2);
		}
		//if the base and the height is the same, we know we are in the diagonal corner of the square.
		//and we have the points A and D
		else if(Math.abs(x1-x2) == Math.abs(y1-y2)){
			System.out.println(x1+" " + y2 + " " + x2 + " " + y1);
		}
		// if the requirement is not meet, its not possible to locate the positions.
		else {
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
