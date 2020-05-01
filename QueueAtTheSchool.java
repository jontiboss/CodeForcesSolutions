import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/266/B
		// https://github.com/jontiboss
		Reader scan = new Reader();
		int n = scan.nextInt();
		int time = scan.nextInt();
		byte[] queueOrder = scan.next().getBytes();
		// How many "time's" should we go trough the queue
		for(int i = 0; i<time;i++) {
			//Go trough the queue
			for(int k = 0;k<queueOrder.length-1;k++) {
				//If there is a girl behind the boy, swap places, increment k if we do a swap, we only want to swap the boy once per round.
				if(queueOrder[k] == 66 && queueOrder[k+1] == 71) {
					byte temp = queueOrder[k];
					queueOrder[k] = queueOrder[k+1];
					queueOrder[k+1] = temp;
					k++;
				}
			}
		}
		
		System.out.println(new String(queueOrder));
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
