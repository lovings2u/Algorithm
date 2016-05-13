package p_st3;

import java.util.Scanner;

public class vauvau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	int b = sc.nextInt();
		int c = sc.nextInt();	int d = sc.nextInt();
		int p = sc.nextInt();	int m = sc.nextInt();	int g = sc.nextInt();	
		int Pcount=0; int Mcount=0; int Gcount=0;
		int fdog = a+b; int sdog = c+d;
		
		if(p%fdog>=1&&p%fdog<=a)	Pcount++;
		if(m%fdog>=1&&m%fdog<=a)	Mcount++;
		if(g%fdog>=1&&g%fdog<=a) 	Gcount++;
		if(p%sdog>=1&&p%sdog<=c)	Pcount++;
		if(m%sdog>=1&&m%sdog<=c)	Mcount++;
		if(g%sdog>=1&&g%sdog<=c)	Gcount++;
				
		String postman,milkman,garbage;
		
		if(Pcount==0) postman="none";
		else if(Pcount==1) postman="one";
		else postman="both";
		
		if(Mcount==0) milkman="none";
		else if(Mcount==1) milkman="one";
		else milkman="both";

		if(Gcount==0) garbage="none";
		else if(Gcount==1) garbage="one";
		else garbage="both";
		
		System.out.print(postman+"\n"+milkman+"\n"+garbage);
	}
}
