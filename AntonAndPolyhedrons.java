import java.util.Scanner;

public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/785/A
		int n,sides = 0;
		String shape;
		Scanner scan = new Scanner(System.in);
		//n is the number of polyhedrons in Anton's collection.
//		System.out.println("How many shapes do you have?");
		n = scan.nextInt();
		shape = scan.nextLine();
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
		scan.close();
		System.out.println(sides);
	}

}
