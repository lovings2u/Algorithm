import java.util.Scanner;
//�� �´µ� ���ؿ��� Ʋ���ٰ� ���ͼ� ��� Ʋ���� �𸣰ھ�� 
public class process {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int a,b;
		for(int i=0;i<t;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			a%=10;//a�� a�� 10���� ���� ������, �������� 0~9����
			System.out.println(check(a,b));
		}
	}
	public static int check(int a,int b){//���������
		int work,last=1,n=1;
		a%=10;//a�� 10���� ���� ������ 0~9���� 
		//a�� ���� ������ �ذ� ������ �ణ �޶��� ���������
		if(a==2){
			if(b%3==0){b/=3;a=8;}
			else if(b%3==1){b=(b-1)/2;a=4;n=2;}
			else if(b%3==2){b/=2;a=4;}
		}else if(a==3){
			if(b%2==0){b/=2;a=9;
			if(b%2==1){b=1;a=9;}
			if(b%2==0){b=0;a=1;}}
			else if(b%2==1){b=(b-1)/2;a=9;
			if(b%2==1){b=1;a=9;}
			if(b%2==0){b=0;a=1;}
			n=3;}
		}else if(a==6){
			a=4;
		}else if(a==7){
			a=3;
			if(b%2==0){
				b/=2;a=9;
				if(b%2==1){b=1;a=9;}
				if(b%2==0){b=0;a=1;}
			}
			else if(b%2==1){b=(b-1)/2;a=9;n=3;}
		}else if(a==8){
			a=2;
			if(b%3==0){b/=3;a=8;}
			else if(b%3==1){b=(b-1)/2;a=4;n=2;}
			else if(b%3==2){b/=2;a=4;}
		}else if(a==9){
			if(b%2==1){b=1;a=9;}
			if(b%2==0){b=0;a=1;}
		}
		work=(int)Math.pow(a, b)*n;
		while(work>10){
			work%=10;
		}
		switch(a){
		case 0:
			last=10;
			break;
		case 1:
			last=1;
			break;
		default:
			last=work;
		}
		return last;
	}

}
