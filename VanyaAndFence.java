import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/677/A
		Scanner scan = new Scanner(System.in);
	    int friends = scan.nextInt();
	    int height = scan.nextInt();
	    int width = 0;
	    
	    
	    for(int i=0;i<friends;i++) {
	    	//If the person needs to bend the width is incremented by 2, else 1
	    	if(scan.nextInt()>height) {
	    		width = width+2;
	    	}
	    	else {
	    		width++;
	    	}
	    }
	    scan.close();
	    System.out.println(width);
	}

}
