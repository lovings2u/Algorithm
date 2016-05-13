package p_st3;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ii[] = new int[7];
		int sum=0;	int min=101;
		for(int i=0;i<ii.length;i++){
			ii[i]=sc.nextInt();
			if(ii[i]%2!=0){
				sum+=ii[i];
				if(ii[i]<=min)
					min=ii[i];
			}
		}
		if(sum==0) System.out.println("-1");
		else System.out.println(sum+"\n"+min);			
	}
}
