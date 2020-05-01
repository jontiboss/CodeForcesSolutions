import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/431/A
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int calories = 0;
		int[] values = new int[4];
		//fill an array with the inputs a1,a2,a3,a4
		for(int k =0;k<values.length;k++) {
			values[k] = scan.nextInt();
		}
		String input = scan.next();
		//the numbers in the string refers to the the values a1,a2,a3,a4 so if the string contains the value 1 then it refers to a1
		//calculate the total sum of the values from the string. the -49 is used to transform the ascii representation to the actual number.
		for(int i =0;i<input.length();i++) {
			
			calories += values[input.charAt(i)-49];
		}
		System.out.println(calories);
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
