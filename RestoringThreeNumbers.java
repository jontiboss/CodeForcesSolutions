import java.util.Scanner;

public class RestoringThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/1154/A
		Long tempX4;
		Long[] nbrs = new Long[4];
		Scanner scan = new Scanner(System.in);
		nbrs[0] = scan.nextLong();
		nbrs[1] = scan.nextLong();
		nbrs[2] = scan.nextLong();
		nbrs[3] = scan.nextLong();
		scan.close();
		//solving using equation system
		//		a+b=x1,
		//		a+b=x2
		//		b+c=x3
		//		a+b+c=x4
		// 		3a+3b+3c=(x1+x2+x3+x4)
		// 		a+b+c=x4=(x1+x2+x3+x4)/3
		//		Solve rest equations using x4
		tempX4 = (nbrs[0]+nbrs[1]+nbrs[2]+nbrs[3])/3;

		for(int i =0; i<nbrs.length;i++) {
			if((tempX4-nbrs[i])>0) {
				System.out.println(tempX4-nbrs[i]);
			}
		}

	}

}
