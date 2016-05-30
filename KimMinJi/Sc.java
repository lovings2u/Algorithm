package study5;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] grades=new int[100];
		int[] count={0,0,0,0,0};
		int i=0,count_g=0;
		
		for(i=0;i<100;i++){
			grades[i]=sc.nextInt();
			if(grades[i]==-1){break;}
			if(grades[i]<=100&&grades[i]>=90){count[0]++;}
			else if(grades[i]<=89&&grades[i]>=80){count[1]++;}
			else if(grades[i]<=79&&grades[i]>=70){count[2]++;}
			else if(grades[i]<=69&&grades[i]>=60){count[3]++;}
			else{count[4]++;}count_g++;
					}
		

		System.out.println(count_g);
		for(i=0;i<5;i++){System.out.println(count[i]);}
	}

}
