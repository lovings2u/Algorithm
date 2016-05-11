import java.util.Scanner;
public class Vauvau {
	public static void main (String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		int c = kbd.nextInt();
		int d = kbd.nextInt();
		
		int p = kbd.nextInt();
		int m = kbd.nextInt();
		int g = kbd.nextInt();
		
		int index [] = new int [3];
		
		
		index[0] = bite(p,a,b,c,d);
		index[1] = bite(m,a,b,c,d);
		index[2] = bite(g,a,b,c,d);
		
		for(int i=0; i<index.length; i++)
			if(index[i] == 2)
				System.out.println("both");
			else if(index[i] == 1)
				System.out.println("one");
			else
				System.out.println("none");
	}
	
	static public int bite(int num, int a, int b, int c, int d){
		int retval=0;
		if((num%(a+b))<=a && (num%(a+b)!=0))
			retval++;
		if((num%(c+d))<=c && (num%(c+d)!=0))
			retval++;
		return retval;
	}
	
	
	
}
