import java.util.Scanner;

public class Clock {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double time, minute;
		
		time = sc.nextInt();
		
		minute = (double)60/11*time;
		
		if(time == 12) {
			System.out.println("0.000000");
		} else if(time == 11) {
			System.out.println("CAN'T SEE!");
		} else {
			System.out.printf("%.6f", minute);
		}
	}
}
