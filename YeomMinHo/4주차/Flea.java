import java.util.Scanner;

public class Flea {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, x, y, dx, dy;
		int jump=0;
		
		s = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		dx = sc.nextInt();
		dy = sc.nextInt();

		for (int i=0 ; i<1100 ; i++) {
		
			if((((int)x/s)%2 == 0 && ((int)y/s)%2 == 1) && x%s != 0 && y%s != 0
					|| (((int)x/s)%2 == 1 && ((int)y/s)%2 == 0) && x%s != 0 && y%s != 0) {
				break;
			}
			
			x = x + dx;
			y = y + dy;
			jump += 1;
			
		}
		
		if (jump == 1100) {
			System.out.println("The flea cannot escape from black squares.");
		} else {
			System.out.println("After " + jump + " jumps the flea lands at (" + x + ", " + y + ").");
		}
	}
}
