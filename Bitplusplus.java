    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
     
    public class Bitplusplus {
     
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		// Problem https://codeforces.com/problemset/problem/282/A
    		// For more solutions check https://github.com/jontiboss
    		
    		Reader reader = new Reader();
    		int tests = reader.nextInt();
    		int answer =0;
    		for(int i =0;i<tests;i++) {
    			String sum = reader.next();
    	
    			if(sum.contains("++")) {
    				answer++;
    			}
    			else {
    				answer--;
    			}
    		
    		}
    		System.out.println(answer);
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
