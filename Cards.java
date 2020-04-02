import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1220/A
		int ones = 0,zeros = 0;
		Scanner scan = new Scanner(System.in);
		// Not needed but is given as a input.
		int n = scan.nextInt();
		String word = scan.next();
		scan.close();
		byte[] wordsByte = word.getBytes();
		//search for how many r and n there is in the array, which is equal to how many zeros or ones there is.
		for(int i = 0; i<wordsByte.length;i++) {
			//If the letter is equal to 'r'
			if(wordsByte[i] == 114) {
				zeros++;
			}
			//If the letter is equal to 'n'
			if(wordsByte[i] == 110) {
				ones++;
			}
		}
		for(int k = 0;k<ones;k++) {
			System.out.print("1 ");
		}
		for(int m = 0;m<zeros;m++) {
			System.out.print("0 ");	
		}
		
	}

}
