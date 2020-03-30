import java.util.Scanner;

public class WrongSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem https://codeforces.com/problemset/problem/977/A
		int n,k;
		Scanner scan = new Scanner(System.in);
		//System.out.println("enter n");
		n = scan.nextInt();
		//System.out.println("enter k");
		k = scan.nextInt();
		scan.close();
		
		//Subtract one k times.
		for(int i =0;i<k;i++) {
			//If the last digit of the number is zero, divide by 10.
		if(n%10 == 0) {
			n = n/10;
		}
		//If the last digit of the number is non-zero, decreases the number by one.
		else {
			n--;
		}
		
		}
		//print out the final result.
		System.out.println(n);
	}

}
