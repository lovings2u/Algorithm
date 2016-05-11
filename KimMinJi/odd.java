package java0511;

import java.util.Scanner;
import java.util.Arrays;

public class odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] num= new int[7];
		int i=0,j=0,sum=0,count=0;
		int[] odd;
		
		for(i=0;i<7;i++){
			num[i]=sc.nextInt();
			if(num[i]%2==1){count++;sum+=num[i];}
		}
		odd=new int [count];
		for(i=0;i<7;i++){
			if(num[i]%2==1){
				odd[j++]=num[i];
			}
		}

		Arrays.sort(odd);
	
		if(sum==0){sum=-1;}
		System.out.println(sum);
		if(odd[0]==0){}
		else{System.out.println(odd[0]);}

	}

}
