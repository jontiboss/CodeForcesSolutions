import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		int rounds = reader.nextInt();
		for(int i =0;i<rounds;i++) {
			int wantedNbr = reader.nextInt();
			int rolls = 0;
			int remainder = wantedNbr;
			//2,3,5,7, 4 6
			if(wantedNbr>=7) {
				rolls += remainder/7;
				remainder = remainder%7;
				
			}
			if(wantedNbr>=6) {
				rolls += remainder/6;
				remainder = remainder%6;
			}
			if(wantedNbr>=5) {
				rolls += remainder/5;
				remainder =+ remainder%5;
			}
			if(wantedNbr>=4) {
				rolls += remainder/4;
				remainder =+ remainder%4;
			}
			if(wantedNbr>=3) {
				rolls += remainder/3;
				remainder =+ remainder%3;
			}
			if(wantedNbr>=2) {
				rolls += remainder/2;
				remainder =+ remainder%2;
			}
			if(remainder == 1) {
				rolls++;
			}
			System.out.println(rolls);
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
