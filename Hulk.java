import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/705/A
		int n;
		boolean love = false;
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();
		for(int i = 0 ; i<n;i++) {
			if(love == true) {
				if(i==n-1) {
					sb = sb.append("I love it ");	
				}

				else {
					sb = sb.append("I love that ");
					love = false;
				}
			}
			else {
				if(i==n-1) {
					sb = sb.append("I hate it ");
				}
				else {
					sb = sb.append("I hate that ");
					love = true;
				}
			}
		}
		System.out.println(sb);
	}

}
