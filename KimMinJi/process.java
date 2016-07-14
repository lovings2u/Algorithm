import java.util.Scanner;
//답 맞는데 백준에서 틀리다고 나와서 어디가 틀린지 모르겠어요 
public class process {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int a,b;
		for(int i=0;i<t;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			a%=10;//a는 a를 10으로 나눈 나머지, 나머지는 0~9까지
			System.out.println(check(a,b));
		}
	}
	public static int check(int a,int b){//나머지계산
		int work,last=1,n=1;
		a%=10;//a는 10으로 나눈 나머지 0~9까지 
		//a에 따라서 지수와 밑과 지수가 약간 달라짐 나머지계산
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
