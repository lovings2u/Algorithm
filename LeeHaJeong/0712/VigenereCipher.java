import java.util.Scanner;
public class VigenereCipher {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		String plain = kbd.nextLine();
		String cyper = kbd.nextLine();

		int plain_c[] = new int[plain.length()];
		char cyper_c[] = new char[plain.length()];
		
		int n = 0;
		while(n <plain.length()){
			for(int i=0; i<cyper.length(); i++, n++)
				cyper_c[n] = cyper.charAt(i);
		}
				
		int cyper_i[] = new int[plain.length()];
		
		for(int i=0; i<plain.length(); i++)
			cyper_i[i] = (int)(cyper_c[i]) - 'a' + 1;
		
		for(int i=0; i<plain.length(); i++){
			plain_c[i] = (int)plain.charAt(i) - cyper_i[i];
			if(plain_c[i] < 'a')
				plain_c[i] += 'z'-'a'+1;
		}
		
		for(int i=0; i<plain_c.length; i++)
			if(plain.charAt(i) != 32)
				System.out.print((char)plain_c[i]);
			else
				System.out.print(" ");
		
	}
}
