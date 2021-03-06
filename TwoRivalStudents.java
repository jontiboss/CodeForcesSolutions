import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoRivalStudents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1257/A
		Reader2 reader = new Reader2();
		int tests = reader.nextInt();
		for(int i =0;i<tests;i++) {
			int students = reader.nextInt();
			int swaps = reader.nextInt();
			int rivalA = reader.nextInt();
			int rivalB = reader.nextInt();
			//Calculate how many students there is between the rivals and then you add how many times you can swap them from eachother.
			//If this sum is bigger than how many students there is, then you know we have reached the maximum distance.
			//Since 1<=students<=n we have to remove 1 from the answer.
			rivalA = Math.abs(rivalA-rivalB) +swaps;
			if(rivalA>=students)
				System.out.println(students-1);
			else
			System.out.println(rivalA);
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
	 static class Reader2
	 {
	 final private int BUFFER_SIZE = 1 << 16; 
     private DataInputStream din; 
     private byte[] buffer; 
     private int bufferPointer, bytesRead; 

     public Reader2() 
     { 
         din = new DataInputStream(System.in); 
         buffer = new byte[BUFFER_SIZE]; 
         bufferPointer = bytesRead = 0; 
     } 

     public Reader2(String file_name) throws IOException 
     { 
         din = new DataInputStream(new FileInputStream(file_name)); 
         buffer = new byte[BUFFER_SIZE]; 
         bufferPointer = bytesRead = 0; 
     } 

     public String readLine() throws IOException 
     { 
         byte[] buf = new byte[64]; // line length 
         int cnt = 0, c; 
         while ((c = read()) != -1) 
         { 
             if (c == '\n') 
                 break; 
             buf[cnt++] = (byte) c; 
         } 
         return new String(buf, 0, cnt); 
     } 

     public int nextInt() throws IOException 
     { 
         int ret = 0; 
         byte c = read(); 
         while (c <= ' ') 
             c = read(); 
         boolean neg = (c == '-'); 
         if (neg) 
             c = read(); 
         do
         { 
             ret = ret * 10 + c - '0'; 
         }  while ((c = read()) >= '0' && c <= '9'); 

         if (neg) 
             return -ret; 
         return ret; 
     } 

     public long nextLong() throws IOException 
     { 
         long ret = 0; 
         byte c = read(); 
         while (c <= ' ') 
             c = read(); 
         boolean neg = (c == '-'); 
         if (neg) 
             c = read(); 
         do { 
             ret = ret * 10 + c - '0'; 
         } 
         while ((c = read()) >= '0' && c <= '9'); 
         if (neg) 
             return -ret; 
         return ret; 
     } 

     public double nextDouble() throws IOException 
     { 
         double ret = 0, div = 1; 
         byte c = read(); 
         while (c <= ' ') 
             c = read(); 
         boolean neg = (c == '-'); 
         if (neg) 
             c = read(); 

         do { 
             ret = ret * 10 + c - '0'; 
         } 
         while ((c = read()) >= '0' && c <= '9'); 

         if (c == '.') 
         { 
             while ((c = read()) >= '0' && c <= '9') 
             { 
                 ret += (c - '0') / (div *= 10); 
             } 
         } 

         if (neg) 
             return -ret; 
         return ret; 
     } 

     private void fillBuffer() throws IOException 
     { 
         bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
         if (bytesRead == -1) 
             buffer[0] = -1; 
     } 

     private byte read() throws IOException 
     { 
         if (bufferPointer == bytesRead) 
             fillBuffer(); 
         return buffer[bufferPointer++]; 
     } 

     public void close() throws IOException 
     { 
         if (din == null) 
             return; 
         din.close(); 
     } 
 } 

}
