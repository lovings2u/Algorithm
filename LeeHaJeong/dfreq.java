import java.util.Scanner;
public class dfreq {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int num = kbd.nextInt();
		int n = kbd.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=1; i<=num; i++)
			sb.append(i);
		
		int i=0;
		int count = 0;
		
		while(i<sb.length()){
			if(sb.charAt(i) == n+'0')
				count++;
			i++;
		}
		System.out.println(count);
	}
}
