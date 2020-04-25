import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TanyaAndStairways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1005/A
		Reader read = new Reader();
		int n = read.nextInt();
		int temp,lastValue=0,stairs=0;
		int[] maxStairs = new int[n];
		for(int i=0;i<n;i++){
			temp = read.nextInt();
			//if the stair number is smaller than the last value, we know that we are on a new floor.
			if(temp<=lastValue) {
				maxStairs[stairs] = lastValue;
				stairs++;
			}
			lastValue=temp;
		}
		
		//add the last staircase
		maxStairs[stairs] = lastValue;
		System.out.println(stairs+1);
		//Print the maximum stairs for each floor
		for(int k=0;k<=stairs;k++) {
			System.out.print(maxStairs[k] + " ");
		}
	}
	
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		
		Reader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next(){
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
		int nextInt(){
			return Integer.parseInt(next());
		}
	}

}
