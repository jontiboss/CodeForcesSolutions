import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class CollectingCoins {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1294/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int tests = reader.nextInt();
		int coins,a,b,c;
		for(int i =0;i<tests;i++) {
			a = reader.nextInt();
			b = reader.nextInt();
			c = reader.nextInt();
			coins = reader.nextInt();
			int sum = a+b+c+coins;
			//if you can divide the total sum into three even stacks and the stack value is bigger or equal to the largest number of coins
			//that one of the sisters have.
			if((sum)%3==0 && (sum)/3>=Math.max(a, Math.max(b,c))){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
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
