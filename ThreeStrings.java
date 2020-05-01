    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
     
    public class ThreeStrings {
     
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		// Problem  https://codeforces.com/problemset/problem/1301/A
    		// https://github.com/jontiboss
    		Reader reader = new Reader();
    		int tests = reader.nextInt();	
    		for(int i=0;i<tests;i++) {
    			boolean flag = true;
    			byte[] a = reader.next().getBytes();
    			byte[] b = reader.next().getBytes();
    			byte[] c = reader.next().getBytes();
    			for(int k =0;k<a.length;k++) {
    				//If we don't have two of the same character, we can't perform a swap and this will result in a no.
    				if(a[k]!=c[k] && b[k]!=c[k]) {
    					System.out.println("NO");
    					flag=false;
    					break;
    				}
    				
    			}
    			//If we can make a swap every time, then we can make so a==b with the help of c. 
    			if(flag) {
    			System.out.println("YES");	
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