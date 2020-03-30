import java.util.Scanner;

public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1030/A
		int n,k;
		boolean isEasy = true;
		//System.out.println("Enter n participants");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		//Go trough all the participants opinions.
		for(int i = 0; i < n;i++) {
			//System.out.println("Enter 1 if the question is hard, else zero");
			k= scan.nextInt();
			//If someone thinks the question is too hard, then break and return that the question is too hard.
			if(k == 1) {
				isEasy = false;
				break;
			}
			
		}
		scan.close();
		//Print the answer.
		if(isEasy == true) {
			System.out.println("EASY");
		}
		else {
			System.out.println("HARD");
		}
	}

}
