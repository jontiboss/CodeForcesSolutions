

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BeautifulYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/271/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int year = reader.nextInt();
		//convert the year to a string, so we can extract all the digits.
		String temp = Integer.toString(year);
		HashSet<Character> nbrs = new HashSet<Character>();
		while(nbrs.size()!=temp.length()) {
			nbrs.clear();
			year++;
			temp = Integer.toString(year);
			//add all distinct numbers into the set, if the number is distinct it will have the length of four.
			for(int i=0;i<temp.length();i++) {
				nbrs.add(temp.charAt(i));
			}
			
		}
		System.out.println(year);	
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
