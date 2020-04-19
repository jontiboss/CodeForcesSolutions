import java.util.Scanner;

public class SystemAdministrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/245/A
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int reachedA= 0,lostA= 0,reachedB = 0,lostB = 0,ping;
		for(int i=0;i<n;i++) {
			//Select if we want to ping A or B, then count the total package that got transmitted to A and how many package that
			//got lost during transition.
			ping = scan.nextInt();
			if(ping==1) {
				reachedA += scan.nextInt();
				lostA += scan.nextInt();
			}
			if(ping==2) {
				reachedB += scan.nextInt();
				lostB += scan.nextInt();
			}
		}
		scan.close();
		//If the sum of reached package is more or equal to the lost package, then the server is considered live, else dead.
		if(reachedA>=lostA) {
			System.out.println("LIVE");
		}
		if(reachedA<lostA) {
			System.out.println("DEAD");
		}
		if(reachedB>=lostB) {
			System.out.println("LIVE");
		}
		if(reachedB<lostB) {
			System.out.println("DEAD");
		}
	}

}
