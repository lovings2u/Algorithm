import java.util.Scanner;
public class D_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		double d = kbd.nextDouble();
		if(d>0)
			System.out.printf("%d %.2f",(int)d/1,(float)d%1);
		else
			System.out.printf("%d %.2f",(int)(d-1)/1,(float)(d%1)+1);
	}
}
