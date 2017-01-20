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
			//특정 위치의 문자를 int 형으로 저장
			//*원거리의 변수에 접근 하는 것이 더 느림
			int num = (int)sb.charAt(i);
			//알파벳일 경우
			if(isAlphabet(num)){
				num += 13;
				//연산 후 알파벳이 아닐 경우
				if(!isAlphabet(num)) {
					num -= 26;
				}
				sb.setCharAt(i, (char)num);
			}
		}
		return sb.toString();
	}
	
	//알파벳인지 판별
	private boolean isAlphabet(int num) {
		if((num>=65&&num<=90)||(num>=97&&num<=122)) return true;
		else return false;
	}
}