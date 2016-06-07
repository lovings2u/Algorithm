import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1,b=0,u=0,i,t=0,s=0;

		while(true){
			if((c*(c+1))/2==n){
				b=c;
				u=1;
				break;}//입력한숫자가 1부터c까지의 합이면 바닥은 c,꼭대기는1
			else if((c*(c+1))/2<n&&n<((c+1)*(c+2))/2){
				b=c+1;//압력한숫자가 1~c까지의 합과 1~(c+1)까지합이면 바닥은 c+1개
				t=n;//n을t에대입
				for(i=b;i>0;i--){//u를구하기 위한 반복문실행
					t-=i;//t를 통나무 i개만큼 쓴건 빼버린다.
					s+=i;//사용한 통나무 개수 체크
					if(t>0&&s==n){//통나무를 입력한개수만큼 이미사용하했는데 t는>0인경우
						u=n-((c*(c+1))/2);//u의개수는 전체에서 c까지의 합을뺸것
						break;//ex 18입력
					}
					else if(t==0){//t가 0인경우
						u=i;//u는 i개 ex 20입력
						break;
					}else if(t<0){
						u=n-s+i;//t가 0ㅇ로 떨어지는경우 ex100
						break;}}//
				
				break;}			
			c++;}		
		System.out.println(b+" "+u);
	}
}
