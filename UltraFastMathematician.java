import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class UltraFastMathematician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/61/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		String inputOne = reader.next();
		BigInteger binary1 = new BigInteger(inputOne,2);
		BigInteger binary2 = new BigInteger(reader.next(),2);
		//xor the two values.
		binary1 = binary1.xor(binary2);
		String answer = binary1.toString(2);
		//add padding zeros, with a one in the MSB, then its just to print a substring at index 1.
		String padds = BigInteger.ONE.shiftLeft(inputOne.length()-answer.length()).toString(2);
		//Print the answer.
		System.out.println(padds.substring(1)+answer);
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
