import java.util.Scanner;
public class Fuse {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int com,prt,rout=0;
		com = kbd.nextInt();
		prt = kbd.nextInt();
		rout = kbd.nextInt();
		double amp = (com*2.5)+(prt*2.0)+(rout*0.5);
		amp = amp*2;
		System.out.println((int)(Math.ceil(amp/10))*10+ " amperes");
	}
}
