import java.util.Scanner;

public class VasyaTheHipster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/581/A
		Scanner scan = new Scanner(System.in);
		int blue = scan.nextInt();
		int red  = scan.nextInt();
		int fashionDays= 0;
		int boomerDays = 0;
		//count how many days Vasya can have socks of each color.
		while(red>=1 && blue>=1) {
			red--;
			blue--;
			fashionDays++;
		}
		// compute how many days he could have socks with the same color afterwards.
		if(red == 0 && blue>=2) {
			boomerDays = boomerDays + (int) blue/2;
		}
		if(red >=2 && blue==0) {
			boomerDays = boomerDays + (int) red/2;
		}
		
		System.out.println(fashionDays + " " + boomerDays);
	}

}
