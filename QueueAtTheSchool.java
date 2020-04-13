import java.util.Scanner;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/266/B
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int time = scan.nextInt();
		byte[] queueOrder = scan.next().getBytes();
		scan.close();
		// How many "time's" should we go trough the queue
		for(int i = 0; i<time;i++) {
			//Go trough the queue
			for(int k = 0;k<queueOrder.length-1;k++) {
				//If there is a girl behind the boy, swap places, increment k if we do a swap, we only want to swap the boy once per round.
				if(queueOrder[k] == 66 && queueOrder[k+1] == 71) {
					byte temp = queueOrder[k];
					queueOrder[k] = queueOrder[k+1];
					queueOrder[k+1] = temp;
					k++;
				}
			}
		}
		
		System.out.println(new String(queueOrder));
	}

}
