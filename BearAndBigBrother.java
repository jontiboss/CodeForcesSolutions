import java.util.Scanner;

public class BearAndBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/791/A
		int limak,bob,years = 0;
		Scanner scan = new Scanner(System.in);
	
//		System.out.println("Enter Limak's weight");
		limak = scan.nextInt();
		
//		System.out.println("Enter Bob's weight");
		bob =scan.nextInt();
		scan.close();
		//For every year Limak's weight gets tripled and Bob's weight gets doubled.
		while(limak<=bob) {
			limak = limak*3;
			bob = bob*2;
			years++;
//			System.out.println("Bob: " + bob + "Limak: " + limak);
		}
		// Prints out how many years it takes before Limak is bigger than Bob
		System.out.println(years);
	}

}
