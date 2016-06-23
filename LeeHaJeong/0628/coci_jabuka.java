import java.util.Scanner;
public class coci_jabuka {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int red = kbd.nextInt();
		int blue = kbd.nextInt();
		int gcd = 0;
		if(red < blue)
			gcd = euclid(blue, red);
		else
			gcd = euclid(red, blue);
		for(int i=1; i<=gcd; i++){
			if(gcd%i == 0)
				System.out.println(i+" "+(red/i)+" "+(blue/i));
		}
	}
	public static int euclid(int a, int b){
		if(a%b == 0)
			return b;
		else
			return euclid(b, a%b);
	}
}
