package p_st2;

import java.util.Scanner;

public class fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double speed=sc.nextDouble();
		int weight=sc.nextInt();
		int strong=sc.nextInt();
		String [] st = new String[3];
		for(int j=0;j<st.length;j++) st[j]=" ";
		int index=0;
	
		if(speed<=4.5 && weight>=150 && strong>=200){
			st[index]="WideReceiver";
			index++;
		}
		
		if(speed<=6.0 && weight>=300 && strong>=500){
			st[index]="Lineman";
			index++;
		}
		if(speed<=5.0 && weight>=200 && strong>=300){
			st[index]="Quarterback";
			index++;
		}
		
		if(index==0){
			System.out.println("No positions");
		}
		
		for(int i=0;i<index;i++){
				System.out.print(st[i]+" ");
			}		
	}
}
