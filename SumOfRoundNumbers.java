import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SumOfRoundNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/1352/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int tests = reader.nextInt();
		int solutions;
		
		for(int i=0;i<tests;i++) {
			HashSet<Integer> numbers = new HashSet<Integer>();
			solutions=0;
			String temp = reader.next();
				for(int k=0;k<temp.length();k++) {
					//if a digit is not equal to zero.
					if(temp.charAt(k)-48 !=0) {
						solutions++;
						//if the character is not zero, multiply it with the digit with 10^(position of the digit) and add all the sums
						//e.g 1023 could be written as 1*10^3 + 0 + 2*10^1 + 3*10^0, which will make the sums 1000,20,3
						//-48 is the offset needed to represent a character as a number.
						numbers.add((int)((temp.charAt(k)-48)*Math.pow(10, temp.length()-k-1)));
					}
					
				}
				System.out.println(solutions);
				//print all the solutions.
				Iterator<Integer> z = numbers.iterator(); 
		        while (z.hasNext()) 
		            System.out.print(z.next() + " "); 
				System.out.println();
			
			
			
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
