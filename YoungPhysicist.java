import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem http://codeforces.com/problemset/problem/69/A
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int sumX = 0,sumY = 0,sumZ = 0;
		// since x=y=z=0 if it is in equilibrium, we could just calculate the total sum for all axis
		// if the sums is equal to zero then it is in equilibrium, otherwise no.
		//3*0(n)
		for(int i = 0;i<n;i++) {
				sumX += scan.nextInt();
				sumY += scan.nextInt();
				sumZ += scan.nextInt();
				}
		scan.close();
		if(sumX == 0 && sumY == 0 && sumZ == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
