import java.util.Scanner;

public class twotile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		long res=1;
		
		
		//방법 구하는 점화식
		 for(int i=1;i<=n;i++){
			res=2*res-1;//이전모양의 그대로에 위에 1*2타일하나, 
						//아래에 1*2타일 을 깔아준것해서 전의 결과의 *2
						//1*2만 n층 깔리는건 중복이기때문에 -1
			if(0==i%2){	//짝수일 경우에는 2*2만 깔리는것과 1*2타일이
						//세로로만 깔리는 유형2가지가 더있어서 +2
				res+=2;
			}
		}
		
		
		System.out.println(res%20100529);//나머지출력 근데20점..ㅋㅋㅋㅋㅋ
	}	

}
