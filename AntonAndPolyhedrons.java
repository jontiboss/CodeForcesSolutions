import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/785/A
		// https://github.com/jontiboss
		int n,sides = 0;
		String shape;
		Reader scan = new Reader();
		//n is the number of polyhedrons in Anton's collection.
//		System.out.println("How many shapes do you have?");
		n = scan.nextInt();
		for(int i = 0; i<n ;i++) {
			//adds a new shape to the total
//			System.out.println("Whats the name of the shape you want to add?");
			shape = scan.nextLine();
			if(shape.equals("Tetrahedron")) {
				sides = sides + 4;

			}
			if(shape.equals("Cube")) {
				sides = sides + 6;

			}
			if(shape.equals("Octahedron")) {
				sides = sides + 8;

			}
			if(shape.equals("Dodecahedron")) {
				sides = sides + 12;

			}
			if(shape.equals("Icosahedron")) {
				sides = sides + 20;

			}

		}
		System.out.println(sides);
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
		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}
}
