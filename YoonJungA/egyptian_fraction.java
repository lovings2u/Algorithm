package c0701;

import java.util.Scanner;

public class egyptian_fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int child = sc.nextInt();
		int parent = sc.nextInt();
		int temp=0;
		String how = "yes";
		
		while(how!="no"){
			double check = (double)parent/child;
			
			for(int i=1;;i++){ 
				if(check<=i) {
					temp=i; break;
				}
			}
			System.out.print("1/"+temp+" ");
			
			int Lcm = lcm(parent,temp);
			int pg = Lcm/parent; int tg = Lcm/temp;
			//통분 해서 계산 한 뒤에 분자 분모 값		
			int t_parent = Lcm;
			int t_child = pg*child-tg;
			
			if(t_child==0) break; //통분해서 분자가 0이면 더이상 계산 필요 없는것
			else{
					parent = Lcm;
					child = pg*child-tg;
			
					if(child==1) { 
						System.out.print("1/"+Lcm+" ");
						how="no";
					}
			}
		}
	}
	
	public static int lcm(int r, int b){
		int m = r; int n = b;  
		int lcd=1;
		
		for(lcd=1;lcd<=m*n;lcd++)
			if((lcd%n==0)&&(lcd%m==0)) break;
				
		return lcd;
	}

}
