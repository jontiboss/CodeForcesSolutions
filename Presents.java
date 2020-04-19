import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/136/problem/A
		Scanner scan = new Scanner(System.in);
		int[]  presents = new int[scan.nextInt()];
		int[]  presents2 = new int[presents.length];
		for(int i =0;i<presents.length;i++) {
			presents[i] = scan.nextInt();
		}
		scan.close();
		//Use the inverse permutation algorithm
		for(int k =0;k<presents.length;k++) {
			 presents2[presents[k]-1] = k+1; 
		}
		for(int k =0;k<presents2.length;k++) {
			 System.out.print(presents2[k] + " "); 
		}
		
	}

}
