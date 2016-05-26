package study5;

import java.util.Scanner;

public class pie {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,demo=0,numer=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(b%a==0){b=b/a;a=a/a;}
		if(d%c==0){d=d/c;c=c/c;}//통분전에 최대한 약분
					
			
		if(b==d){demo=b;numer=b-(a+c);}//분모같으면 통분필요없음
		else{demo=b*d;//분모통분
			numer=b*d-(a*d+b*c);}//통분해서 1에서뺸값의 분자
		
		
		
		if(numer==0){
			System.out.println("0");//불능
		}
		else if(demo%numer==0){		
			demo=demo/numer;
			numer=numer/numer; 
			System.out.println(numer+"/"+demo);//약분
	
		}else 
			if(numer%3==0&&demo%3==0){
				System.out.println(numer/3+"/"+demo/3);//test10때문에 추가
			}else{
			System.out.println(numer+"/"+demo);
		}
		
				
		
	}

}
