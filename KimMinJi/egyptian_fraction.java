import java.util.Scanner;//미완성 ㅠ오류있음  

public class egyptian_fraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=0,sum=0;
		int [] bb= new int [10];
		
			a*=2;
			b*=2;//일단 2씩 곱한당
			bb[0]=1;
			for(int i=2;i<b;i++){
				if(b%i==0){
					bb[c]=i;//약수면 배열에 추가
					c++;}//몇 개 인지 카운트 하기위해 
				}//분모의 약수 구하기 
			
			for(int i=9;i>-1;i--){
				sum+=bb[i];
				if(sum!=0&&sum<a){
					System.out.print("1/"+b/bb[i]+" ");
				}else if(sum==a){
					System.out.print("1/"+b/bb[i]+" ");
				}else if(sum>a){
					sum-=bb[i];
				}else{}
			}
		}
	}


