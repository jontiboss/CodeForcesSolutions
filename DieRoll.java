import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DieRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/9/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		//calculate the biggest roll
		int max = Math.max(reader.nextInt(), reader.nextInt());
		//since there is only 6 possible outcomes, it could be simply hard coded. 
		switch (max) {
		case 1:
			System.out.println("1/1");
		break;
		case 2:
			System.out.println("5/6");
			break;
			case 3:
				System.out.println("2/3");
				break;
				case 4:
					System.out.println("1/2");
					break;
					case 5:
						System.out.println("1/3");
						break;
						case 6:
							System.out.println("1/6");
							break;

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
