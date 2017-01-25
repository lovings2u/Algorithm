import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q11656 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=new String[s.length()]; 
		for(int i=0;i<s.length();i++){
			st[i]=s.substring(i);
			//System.out.println(st[i]);
		}
		Arrays.sort(st);
		for(int i=0;i<s.length();i++){
			System.out.println(st[i]);
		}
	}

}
