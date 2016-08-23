import java.util.Scanner;
import java.util.StringTokenizer;
public class PhonePW {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		String s = kbd.next();
		int p = kbd.nextInt();
		int m = kbd.nextInt();
		
		String[] num = new String[100];
		String[] result = new String[4];
		
		StringTokenizer st = new StringTokenizer(s,"-");
		
		int index = 0;
		
		while(st.hasMoreTokens()){
			num[index++] = st.nextToken();
			if(num[index-1].length()>4){
				System.out.println("INPUT ERROR!");
				System.exit(0);
			}
		}
		
		index = 0;
		for(int i=0; i<num[m-1].length(); i++){
			char ch = num[m-1].charAt(i);
			int n = ch-'0';
			int t = n+p;
			if(t>9)
				t-=10;
			result[index] = Integer.toString(t);
			index++;
		}
			
		for(int i=0; i<4-num[m-1].length(); i++)
			System.out.print(p);
		
		for(int i=0; i<num[m-1].length(); i++)
			System.out.print(result[i]);
	}
}
