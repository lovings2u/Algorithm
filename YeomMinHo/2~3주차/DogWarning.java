import java.util.Scanner;

public class DogWarning {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C,D;
		int[] person = new int[3];
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		for(int i=0 ; i<3 ; i++) {
			person[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<3 ; i++) {
			switch( check(A, B, C, D, person[i]) ) {
				case 0 :
					System.out.println("none");
					break;
				case 1 :
					System.out.println("one");
					break;
				case 2 :
					System.out.println("both");
					break;
			}
		}
	}
	
	public static int check(int a, int b, int c, int d, int person) {
		int count=0;
		
		if (person%(a+b) <= a && person%(a+b) != 0) {
			count++;
		}
		if (person%(c+d) <= c && person%(c+d) != 0) {
			count++;
		}

		return count;
	}
}
