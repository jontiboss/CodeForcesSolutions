import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/contest/263/problem/A
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[5][5];
	
		for(int i = 0;i<matrix.length;i++) {
			for(int k=0;k<matrix.length;k++) {
				matrix[i][k] = scan.nextInt();
				}
	}
		scan.close();
		System.out.println(beautifulMatrix(matrix));
		}
	
	//Imagine a x-y coordinate plane where the point you want to reach is (2,2)
	//calculate how many steps you have to go until you reach the desired destination by calculate (|2-x1| + |2-y1|) where
	// (x1,y1) is the coordinates of the '1' in the matrix.
	public static int beautifulMatrix(int[][] matrix) {
		for(int i = 0;i<matrix.length;i++) {
			for(int k=0;k<matrix.length;k++) {
				if(matrix[i][k]>0) {
					return (int) (Math.abs(2-i)+Math.abs(2-k));
				}
			}
		}
		return 0;
	}
}
