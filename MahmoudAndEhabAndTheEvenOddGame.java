import java.util.Scanner;

public class MahmoudAndEhabAndTheEvenOddGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/959/A
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		//considering both players play optimally, the winner will be determine whether n is even or not.
		if(n%2==0) {
			System.out.println("Mahmoud");
		}
		else {

			System.out.println("Ehab");
		}
	}

}
