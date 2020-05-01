import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MishkaAndGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/703/problem/A	
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int round = scan.nextInt();
		int mishka=0,chris=0;
		int temp1,temp2;
		int timeSaver = (int) round/2 ;
		for(int i =0;i<round;i++) {
			temp1= scan.nextInt();
			temp2= scan.nextInt();


			if(temp1>temp2) {
				mishka++;
			}
			if(temp1<temp2) {
				chris++;
			}
			//if one of the players have more than wins than half of the round, that player have already won,no need to check the rest.
			if(mishka>(timeSaver) || chris>(timeSaver)) {
				break;
			}

		}



		if(chris>mishka) {
			System.out.println("Chris");
		}
		if(mishka>chris) {
			System.out.println("Mishka");

		}
		if(mishka==chris){
			System.out.println("Friendship is magic!^^");
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
