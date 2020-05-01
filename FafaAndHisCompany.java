import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FafaAndHisCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/935/A
		// https://github.com/jontiboss
		int combinations = 0;
		Reader scan = new Reader();
		int employees = scan.nextInt();
		
		
		//i is the number of leaders
		for(int i = 1; i<employees;i++ ) {
			double remindingEmployees = employees-i;
				
				if((remindingEmployees/i)%1==0){
					
					combinations++;
				
			} //When we remaindingEmployees/i == 1 there will be no more whole numbers since the denominator will be bigger than the numerator.
				if(remindingEmployees/i == 1) {
					break;
				}
		}
		System.out.println(combinations);
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
