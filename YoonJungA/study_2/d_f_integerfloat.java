package level1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class d_f_integerfloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextFloat();
		
		int N1 = (int)Math.floor(N);

		//소수점 둘째자리 까지 나타낸다.
		DecimalFormat f = new DecimalFormat("0.00");
		String a1 = f.format(N-N1);
		System.out.println(N1+" "+a1);
		
	}
}

