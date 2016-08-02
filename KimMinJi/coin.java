import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price=sc.nextInt(),j=0;
		int [] coins=new int[6];
		int [] cash=new int[4];
		int c1=0,c5=0,c10=0,c50=0,c100=0,c500=0;
		for(int i=0;i<coins.length;i++){
			coins[i]=sc.nextInt();
		}
		//price최대금액 6660
		for(int i=3;i>=0;i--){
			cash[j]=(price/(int)Math.pow(10, i));
			price=price-cash[j]*(int)Math.pow(10, i);
			//System.out.println(cash[j]);
			j++;
		}//각 자리수 숫자 구하기
		if(cash[3]==0){//1의 자리는 1,5원 할당가능
			if(coins[5]==10){
				c1=coins[5];
				cash[2]--;}
			
		}
		else if(cash[3]<=coins[5]){
			c1=cash[3];
		}
		else if(cash[3]>0&&cash[3]>coins[5]){
			c1=cash[3]%5;
			c5++;
			coins[4]--;
		}//1의자리수 동전 최대 할당
		c5=spend5(cash[2],coins[4],c5);//10의자리에 5원동전 최대할당
		cash[2]-=c5/2;//5원 쓴만큼 10의자리 고쳐주기
		if(cash[2]==0){
			if(coins[3]==10){
			c10=coins[3];
			cash[1]--;}			
		}else if(cash[2]<=coins[3]){
			c10=cash[2];
		}else if(cash[2]>0&&cash[2]>coins[3]){
			c10=cash[2]%5;
			c50++;
			coins[2]--;
		}//10의자리에 10,50원 동전 최대할당
		c50=spend5(cash[1],coins[2],c50);//100의자리에 50원 최대할당
		cash[1]-=c50/2;//50원쓴만큼 100의자리 고쳐주기
		if(cash[1]==0){
			if(coins[1]==10){
			c100=coins[1];
			cash[0]--;}
		}else if(cash[1]<=coins[1]){
			c100=cash[1];
		}else if(cash[1]>0&&cash[1]>coins[1]){
			c100=cash[1]%5;
			c500++;
			coins[0]--;
		}
		if(cash[0]>0){
			c500=spend5(cash[0],coins[0],c500);}//1000자리에 500원 최대할당
		System.out.println(c500+c100+c50+c10+c5+c1);
		System.out.println(c500+" "+c100+" "+c50+" "+c10+" "+c5+" "+c1);
		
	}
	public static int spend5(int n, int coins,int c5){//n의자리,내가가진동전,사용할동전
		if(n!=0&&coins>1){
			n--;coins-=2;c5+=2;
			if(coins>1){
				spend5(n,coins,c5);
			}
		}
		return c5;
		
	}

}
