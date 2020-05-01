import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaTheHipster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/581/A
		Reader scan = new Reader();
		int blue = scan.nextInt();
		int red  = scan.nextInt();
		int fashionDays= 0;
		int boomerDays = 0;
		//count how many days Vasya can have socks of each color.
		while(red>=1 && blue>=1) {
			red--;
			blue--;
			fashionDays++;
		}
		// compute how many days he could have socks with the same color afterwards.
		if(red == 0 && blue>=2) {
			boomerDays = boomerDays + (int) blue/2;
		}
		if(red >=2 && blue==0) {
			boomerDays = boomerDays + (int) red/2;
		}
		
		System.out.println(fashionDays + " " + boomerDays);
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
