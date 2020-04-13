import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/contest/617/submission/76595779
		Scanner scan = new Scanner(System.in);
		int reminder = scan.nextInt();
		int steps = 0;
		scan.close();
		// Always choose the maximum distance you are able to walk, then count how many times you can do it.
		// Example: 12/5 = 2 + the reminder 3
		// 3/3 = 1 + the reminder 0
		// reminder = 0, done
		// the minimum times you have to move until you reach 12 is 3
		if(reminder>=5) {
			steps = steps +  reminder/5;
			reminder = reminder%5;
		}
		if(reminder==4) {
			steps = steps + reminder/4;
			reminder = reminder%4;
		}
		if(reminder==3) {
			steps = steps +  reminder/3;
			reminder = reminder%3;
		}
		if(reminder==2) {
			steps = steps +  reminder/2;
			reminder = reminder%2;

		}
		if(reminder==1) {
			steps = steps +  reminder/1;
			reminder = reminder%1;
		}

		System.out.println(steps);
	}

}
