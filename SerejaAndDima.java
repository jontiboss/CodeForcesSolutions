import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SerejaAndDima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/381/A
		// For more solutions check https://github.com/jontiboss
		Reader reader = new Reader();
		int cards = reader.nextInt();
		int serja =0,dima=0;
		
		boolean eachTurn = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<cards;i++) {
			list.add(reader.nextInt());
		}
		int left = 0,right =list.size()-1;
		
		for(int k=0;k<=list.size()-1;k++) {
			int max = Math.max(list.get(left), list.get(right));
			if(list.get(left)>list.get(right)) {
				left++;
			}
			else {
				right--;
			}
			
			if(eachTurn) {
				serja+=max;
			}
			else {
				dima+=max;
			}
			eachTurn = !eachTurn;
		}
		System.out.println(serja +" "+ dima);
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
