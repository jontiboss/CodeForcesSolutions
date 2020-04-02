import java.util.Scanner;

public class BetweenTheOffices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/867/A
		Scanner scan = new Scanner(System.in);
		int f=0,s=0;
		// Not used.
		int n = scan.nextInt();
		byte[] flights = scan.next().getBytes();
		scan.close();
		for(int i=1;i<flights.length;i++) {
			
			
			if(flights[i] == 70 && (flights[i-1] != flights[i])) {
			f++;
		
		}
			if(flights[i] == 83 && (flights[i-1] != flights[i])) {
				s++;
			}
		}
			if(s<f){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	

}
