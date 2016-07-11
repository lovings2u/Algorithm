package password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String plain = sc.nextLine();
		String des = sc.nextLine();
		
		char[] plainChar = plain.toCharArray();
		char[] desChar = des.toCharArray();
		int[] resultInt = new int[plainChar.length];
		for(int i = 0; i < plainChar.length; i++) {
			if(plainChar[i] < 97){
				resultInt[i] = (int)plainChar[i];
				continue;
			}
			if((int)plainChar[i] > (int)desChar[i%desChar.length]) {
				resultInt[i] = (int)plainChar[i] - (int)desChar[i%desChar.length] + 96;
			} else {
				resultInt[i] = 122 - ((int)desChar[i%desChar.length] - (int)plainChar[i]);
			}
		}
		for(int i = 0; i < resultInt.length; i++) {
			System.out.print((char)resultInt[i]);
		}
	}
}
