import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntonAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/734/B
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int two = reader.nextInt();
		int three = reader.nextInt();
		int five = reader.nextInt();
		int six = reader.nextInt();
		//line below is used many times, so this only needs to be computed once instead of three times.
		int fiveSixMin = Math.min(five, six);
		
		//Count the smallest value of two,five and six. thats how many 256 numbers you could make.
		// remove the amount of twos needed in the making of the number 256, if the rest is bigger than 2 create as many 32 numbers as possible.
		//<<8 is 2^8 = 256 , <<5 == 2^5=32
		int sum = (Math.min(two,fiveSixMin)<<8);
		if(two-fiveSixMin>=0){
			sum += (Math.min(two-fiveSixMin, three)<<5);
		}
		System.out.println(sum);

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
