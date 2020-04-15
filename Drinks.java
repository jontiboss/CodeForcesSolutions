import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/200/B
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		// sum the total volume from each drink and divide it by n
		for(int i =0;i<n;i++) {
			sum = sum+scan.nextInt();
		}
		System.out.println(sum/n);
	}

}
