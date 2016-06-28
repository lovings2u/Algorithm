import java.util.Scanner;
import java.io.FileInputStream;

class frogjump {
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
        
		Scanner sc = new Scanner(System.in);

		int TC;//테스트개수
		int test_case;//현재 몇번째 테스트인지
        int n,k,i,jump=0,max=0,sum=0;//입력받을 돌개수,점프거리,결과


		TC = sc.nextInt();//테스트개수 입력받음
		for(test_case = 1; test_case <= TC; test_case++) {
			n=sc.nextInt();
			int []stone = new int [n];
			int []gap = new int [n-1];
			for(i=0;i<n;i++){
				stone[i]=sc.nextInt();
			}
			gap[0]=stone[0];
			for(i=1;i<n-1;i++){
				gap[i]=stone[i+1]-stone[i];
				max=Math.max(max,gap[i]);
			}
			k=sc.nextInt();
			i=0;
			if(k<max){jump=-1;}
			else{
				while(i==n){
					if(k>sum){
						sum+=gap[i];
						i++;
					}else{
						sum=gap[i];
						jump++;
						i++;
					}
				}
			}			
			System.out.println("Case #" + test_case);
			System.out.println(jump);
			
		}
	}
}