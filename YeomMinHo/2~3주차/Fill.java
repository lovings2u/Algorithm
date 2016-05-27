import java.util.Scanner;

public class Fill {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed;
		int weight, force;
		String position="";
		
		speed = sc.nextDouble();
		weight = sc.nextInt();
		force = sc.nextInt();
		
		if (speed<=4.5 && weight>=150 && force>=200) {
			position = "Wide Receiver";
			System.out.print(position + " ");
		}
		
		if (speed<=6.0 && weight>=300 && force>=500) {
			position = "Lineman";
			System.out.print(position + " ");
		}
		
		if (speed<=5.0 && weight>=200 && force>=300) {
			position = "Quarterback";
			System.out.print(position);
		}
		
		if (position == "") {
			System.out.print("No positions");
		}
		
	}
}
