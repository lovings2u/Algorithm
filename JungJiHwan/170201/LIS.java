package Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//24562
//346453
public class LIS {
	public static void main(String[] args) {new LIS();}
	public LIS() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrA = new ArrayList<>();
		ArrayList<String> arrB = new ArrayList<>();
		String A = sc.nextLine(), B = sc.nextLine();
		
		for(int i = 0; i<A.length(); i++){
			arrA.add(summaryNum(A, A.charAt(i), i));
		}
		for(int i = 0; i<B.length(); i++){
			arrB.add(summaryNum(B, B.charAt(i), i));
		}
		
		int indexA = 0, indexB = 0, len = 0;
		for(int i = 0; i<arrA.size(); i++){
			if(arrA.get(i).length()>len) {
				len = arrA.get(i).length();
				indexA = i;
			}
		}
		for(int i = 0; i<arrB.size(); i++){
			if(arrB.get(i).length()>len) {
				len = arrB.get(i).length();
				indexB = i;
			}
		}
		
		char[] arr_ch = (arrA.get(indexA) + arrB.get(indexB)).toCharArray();
		Arrays.sort(arr_ch);
		System.out.println(arr_ch);
		
	}
	public String summaryNum(String arr,char ch, int index){
		String str = "";
		str += ch;
		
		for(int i = index; i<arr.length(); i++){
			if(ch<arr.charAt(i)){
				ch = arr.charAt(i);
				str += ch;
			}
		}
		
		return str;
	}
}
