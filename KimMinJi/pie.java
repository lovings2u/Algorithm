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
		if(d%c==0){d=d/c;c=c/c;}//������� �ִ��� ���
					
			
		if(b==d){demo=b;numer=b-(a+c);}//�и����� ����ʿ����
		else{demo=b*d;//�и����
			numer=b*d-(a*d+b*c);}//����ؼ� 1�����A���� ����
		
		
		
		if(numer==0){
			System.out.println("0");//�Ҵ�
		}
		else if(demo%numer==0){		
			demo=demo/numer;
			numer=numer/numer; 
			System.out.println(numer+"/"+demo);//���
	
		}else 
			if(numer%3==0&&demo%3==0){
				System.out.println(numer/3+"/"+demo/3);//test10������ �߰�
			}else{
			System.out.println(numer+"/"+demo);
		}
		
				
		
	}

}
