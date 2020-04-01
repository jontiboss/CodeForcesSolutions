import java.util.Scanner;

public class VusTheCossackAndAContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/1186/problem/A
		Scanner scan = new Scanner(System.in);
		int n,m,k;
		n = scan.nextInt();
		m = scan.nextInt();
		k = scan.nextInt();
		scan.close();
		// checks if Vus can give out both a pen and a notebook to all participants.
		if(n<=m && n<=k) {
			System.out.println("Yes");
			}
		else {
			System.out.println("No");
		}
	}

}
