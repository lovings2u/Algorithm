package Backjoon1;

import java.util.Scanner;

public class Q11656 {
	public static void main(String[] args) {
		new Q11656();
	}
	
	public Q11656() {
		String strarr[] = cutAndsort(new Scanner(System.in).nextLine());
		for(int i = 0; i<strarr.length; i++){
			System.out.println(strarr[i]);
		}
	}
	
	public String[] cutAndsort(String str){
		//cut
		int len = str.length();
		String strarr[] = new String[len];
		for(int i = 0; i<len; i++){
			strarr[i] = str.substring(i, len);
		}
		
		//sort
		for(int i = 0; i<len - 1; i++){
			for(int j = i; j<len; j++){
				if(strarr[i].compareTo(strarr[j])>0){
					String temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
		}
		
		return strarr;
	}
}
