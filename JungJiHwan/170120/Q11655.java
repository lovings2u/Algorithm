package Backjoon1;

import java.util.Scanner;

public class Q11655 {
	public static void main(String[] args) {
		new Q11655();
	}
	
	public Q11655() {
		System.out.println(ROT13(new Scanner(System.in).nextLine()));
	}
	
	private String ROT13(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i<str.length(); ++i){
			int num = (int)sb.charAt(i);
			if(isAlphabet(num)){
				num += 13;
				if(!isAlphabet(num)) {
					num -= 26;
				}
				sb.setCharAt(i, (char)num);
			}
		}
		return sb.toString();
	}
	
	private boolean isAlphabet(int num) {
		if((num>=65&&num<=90)||(num>=97&&num<=122)) return true;
		else return false;
	}
}
