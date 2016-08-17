package jungol;

import java.util.*;

public class Q1620CodeInsideNum {
	static private String str, strcut[];
	static private char ch[];
	static private int num, sum;
	static private boolean check = true;
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		strcut = str.split("-");
		for(int i = 0; i<strcut.length; i++){
			if(strcut[i].length()>4) {
				check = false;
				break;
			}
		}
		num = sc.nextInt();
		str = strcut[sc.nextInt()-1];
		sc.close();
		ch = str.toCharArray();
		if(check){
			for(int i = 0; i<str.length(); i++){
				sum = Integer.parseInt(String.valueOf(str.charAt(i))) + num;
				if(sum > 9) sum = sum%10;
				ch[i] = String.valueOf(sum).charAt(0);
			}
			
		}
		else ch = "INPUT ERROR!".toCharArray();
		System.out.println(ch);
	}
}
