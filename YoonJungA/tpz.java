import java.util.Scanner;

public class tpz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();
		int g = sc.nextInt();
		
		int max=0; int min=0;
		
		if(t<=p){ //최소값 찾기
			if(t<=g) max=t;
			else max=g;
		}else{
			if(p<=g) max=p;
			else max=g;
		}
		
		if(t+p+g<=N) min=0; //종족수의 합이 총 인수보다 작으면 0
		else{
			int count1 = N-t; //테란 구하고 남은 수
			int count2 = N-p; //프로토스 구하고 남은 수
			
			if(count1+count2>=g) min=0; //둘의 남은수 합이 g가 필요한 수보다 같거다 크면 0
			else min = g-(count1+count2); //아니면 g에서 남은수 뺀값이 셋다 좋아하는 수
		}
		System.out.println(max+" "+min);
			
	}

}
