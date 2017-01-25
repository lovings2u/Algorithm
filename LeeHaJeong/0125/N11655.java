import java.util.Scanner;

public class N11655 {
	public static void main(String[] args){
		String s = new String();
		Scanner kbd = new Scanner(System.in);
		s = kbd.nextLine();
		
		for(int i=0; i<s.length(); i++){
			int ch = s.charAt(i);
			if(ch>='a' && ch<='z'){
				ch = ch+13;
				if(ch>'z')
					ch = ch-('z'-'a'+1);
			}
			if(ch>='A' && ch<='Z'){
				ch = ch+13;
				if(ch>'Z')
					ch = ch-('Z'-'A'+1);
			}
			System.out.print((char)ch);
		}
	}
}
