package Dinamic;

import java.util.Scanner;


public class Q1871_cmp {
	static int[] input;
	static int[] maxVal;
	static int[] result;
	static int count;
	public static void main(String[] args) {
		//입력부
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		input = new int[count];
		for(int i =0;i<count;i++){
			input[i] = sc.nextInt();
		}
		maxVal = new int[count];
		result = new int[count];
		
		//실행함수
		dinamic();
		
		//출력부
		int min=Integer.MAX_VALUE;
		for(int i =0;i<count;i++){
			result[i] = count-maxVal[i];
			if(min>result[i]){
				min = result[i];
			}
		}
		System.out.println(min);
	}
	public static void dinamic(){
		for(int i = count-1;i>=0;i--){
			int max = 0; 
			for(int j =i+1;j<count;j++){
				if(input[i]<input[j]){
					if(max<maxVal[j]){
						max = maxVal[j];
					}
				}
			}
			maxVal[i] = max+1;
		}
	}
	

}
