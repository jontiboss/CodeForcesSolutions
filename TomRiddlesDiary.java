import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TomRiddlesDiary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/855/A
		// https://github.com/jontiboss
		Reader read =new Reader();
		int names = read.nextInt();
		List<String> list = new ArrayList<String>();
		//Store all the names in the list, if the name already exists print yes, else add it to the list and print no.
		for(int i=0;i<names;i++) {
			String temp = read.next();
			if(list.contains(temp)) {
				System.out.println("YES");
			}
			else {
				list.add(temp);
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
