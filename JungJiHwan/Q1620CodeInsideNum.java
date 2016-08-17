package jungol;

import java.util.*;

public class Q1620CodeInsideNum {
	static private String str, strcut[];
	static private char ch[],copy[] = new char[4];
	static private int num, sum, k;
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
		k = sc.nextInt()-1;
		if(strcut.length <= k){
			System.out.print(num);
			System.out.print(num);
			System.out.print(num);
			System.out.print(num);
			return;
		}
		str = strcut[k];
		sc.close();
		ch = str.toCharArray();
		switch(ch.length){
		case 3:{
			copy[3] = ch[2];
			copy[2] = ch[1];
			copy[1] = ch[0];
			copy[0] = '0';
			break;
		}
		case 2:{
			copy[3] = ch[1];
			copy[2] = ch[0];
			copy[1] = '0';
			copy[0] = '0';
			break;
		}
		case 1:{
			copy[3] = ch[0];
			copy[2] = '0';
			copy[1] = '0';
			copy[0] = '0';
			break;
		}
		default:{
			copy[3] = ch[3];
			copy[2] = ch[2];
			copy[1] = ch[1];
			copy[0] = ch[0];
		}
		}
		
		if(check){
			for(int i = 0; i<copy.length; i++){
				sum = Integer.parseInt(String.valueOf(copy[i])) + num;
				if(sum > 9) sum = sum%10;
				copy[i] = String.valueOf(sum).charAt(0);
			}
			
		}
		else copy = "INPUT ERROR!".toCharArray();
		System.out.println(copy);
	}
}
