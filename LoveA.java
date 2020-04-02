import java.util.Scanner;

public class LoveA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1146/A
		Scanner scan = new Scanner(System.in);
		int a = 0;
		
		byte[] word = scan.next().getBytes();
		scan.close();
		//Checks the string input for how many a's there is
		for(int i = 0; i<word.length;i++) {
			if(word[i] == 97) {
				a++;
			}
			
		}
		int remaningLetters = word.length-a;
		//Remove a letter until the majority of the letters is a's.
		while(a<=remaningLetters) {
			remaningLetters--;
		}
		
		System.out.println(a+remaningLetters);
			
	}

}
