import java.util.Scanner;

public class Borze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/32/B
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		byte[] word = scan.next().getBytes();
		scan.close();
		for(int i = 0; i<word.length;i++) {
			if(word[i] == 46) {
				sb.append(0);
			}
			if(word[i]==45 && word[i+1]==46) {
				sb.append(1);
				i++;
			}
			if(word[i]==45 && word[i+1]==45) {
				sb.append(2);
				i++;
			}
		}
		System.out.println(sb.toString());
	}

}
