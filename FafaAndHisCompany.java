import java.util.Scanner;

public class FafaAndHisCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=4240174
		int combinations = 0;
		Scanner scan = new Scanner(System.in);
		int employees = scan.nextInt();
		scan.close();
		
		//i is the number of leaders
		for(int i = 1; i<employees;i++ ) {
			double remindingEmployees = employees-i;
				
				if((remindingEmployees/i)%1==0){
					
					combinations++;
				
			} //When we remaindingEmployees/i == 1 there will be no more whole numbers since the denominator will be bigger than the numerator.
				if(remindingEmployees/i == 1) {
					break;
				}
		}
		System.out.println(combinations);
	}

}
