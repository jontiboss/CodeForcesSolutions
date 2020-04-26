import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddOddOrSubtractEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1311/A
		Reader scan = new Reader();
		int tests = scan.nextInt();
		int startPoint,endPoint,distance;
		 //run x tests
		for(int i=0;i<tests;i++) {
			startPoint = scan.nextInt();
			endPoint = scan.nextInt();
			//calculate the distance between the start and endpoint
			distance = Math.abs(startPoint-endPoint);
			//if the distance is zero, we dont need to move
			if(distance==0)
				System.out.println(0);
			//Since we can only add even numbers, if the distance is odd, we always need to move two times, if the distance is even you only need to move once.
			// if the startpoint is bigger than the endpoint the logic is reversed since we can only subtract odd numbers.
			else if(startPoint>endPoint)
			System.out.println((distance & 1) == 0 ? 1 : 2 ); 
			else
				System.out.println((distance & 1) == 0 ? 2 : 1 ); 
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
