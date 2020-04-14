import java.util.Scanner;

public class AntonAndDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/734/A
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int A=0,D=0;
		String gamesequence = scan.next();
		scan.close();
		//Counts how many wins each player got
		for(int i = 0;i<gamesequence.length();i++) {
			if(gamesequence.charAt(i) == 'A') {
				A++;
			}
			else {
				D++;
			}
		}
		//		Print the winner
		if(A>D) {
			System.out.println("Anton");
		}
		else if(A<D) {
			System.out.println("Danik");	
		}
		else {
			System.out.println("Friendship");
			
		}

	}

}
