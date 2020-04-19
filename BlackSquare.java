import java.util.Scanner;

public class BlackSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/431/A
		Scanner scan = new Scanner(System.in);
		int calories = 0;
		int[] values = new int[4];
		//fill an array with the inputs a1,a2,a3,a4
		for(int k =0;k<values.length;k++) {
			values[k] = scan.nextInt();
		}
		String input = scan.next();
		scan.close();
		//the numbers in the string refers to the the values a1,a2,a3,a4 so if the string contains the value 1 then it refers to a1
		//calculate the total sum of the values from the string. the -49 is used to transform the ascii representation to the actual number.
		for(int i =0;i<input.length();i++) {
			
			calories += values[input.charAt(i)-49];
		}
		System.out.println(calories);
	}

}
