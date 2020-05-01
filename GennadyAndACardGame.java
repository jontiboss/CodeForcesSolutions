import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.StringTokenizer;
 
public class GennadyAndACardGame {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/1097/problem/A
		// https://github.com/jontiboss
		boolean canPut = false;
		byte[] allByteArray = new byte[12];
		Reader scan = new Reader();
		ByteBuffer buff = ByteBuffer.wrap(allByteArray);
		
		
		// Puts the board card + the cards on your hand into an byte array.
		buff.put(scan.next().getBytes());
		buff.put(scan.next().getBytes());
		buff.put(scan.next().getBytes());
		buff.put(scan.next().getBytes());
		buff.put(scan.next().getBytes());
		buff.put(scan.next().getBytes());
		byte[] combined = buff.array();
 
 
		//Loops trough the byte array.
		for(int i = 2; i<11;i = i+2) {
			// If we have the same suit or the same number we can place a card on the table.
			if(combined[0] == combined[i] || combined[1] == combined[i+1]) {
				canPut = true;
				break;
 
			}
		}
		//Print the final output.
		if(canPut==true) {
			System.out.println("YES");
		}
		if(canPut==false) {
			System.out.println("NO");
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
