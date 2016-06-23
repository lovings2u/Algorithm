import java.util.Scanner;
public class tpz {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int t = kbd.nextInt();
		int p = kbd.nextInt();
		int z = kbd.nextInt();
		int max, min = 0;
		max = (int)Math.min(t, p);
		max = (int)Math.min(max, z);
		min = z - (n-t) - (n-p);
		if(min < 0)
			System.out.println(max+" "+0);
		else
			System.out.println(max+" "+min);
	}
}
