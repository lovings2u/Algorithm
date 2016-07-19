package c0714;

import java.util.ArrayList;
import java.util.Scanner;

public class Distributedddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		//int result[] = new int[100];
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++){
			
			int check=0;
			int count=0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp=a;
			int result[] = new int[100];
			
			while(true){
				
				count++;
				
				if(a%10==0){
					result[0]=10;
					check=1;
					break;
				}
				else{
					result[count-1]=a%10;
				
					if(count>=2){
						for(int m=1; m<count; m++){
							if(result[0]==result[m]){
								check=m; break;
							}
						}
					}
				}
				
				if(check!=0) break;
				a=a*temp;
				
			}
			
			
			int data = b%check;
			if(check==1) num.add(result[0]);
			else if(data==0) num.add(result[check-1]);
			else num.add(result[data-1]);
					
		}
		for(int k=0;k<num.size();k++)
			System.out.println(num.get(k));
	}

}
