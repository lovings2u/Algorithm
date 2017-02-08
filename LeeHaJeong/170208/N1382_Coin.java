import java.util.Scanner;
public class N1382_Coin {
	static int t;
	static int k;
	static int p[];
	static int n[];
	static int d[][];
	//http://comganet.github.io/dp/2016/06/03/dp-1005
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		t = kbd.nextInt();//지폐 금액
		k = kbd.nextInt();//동전 가짓수
		p = new int[k+1];//각 동전의 금액
		n = new int[k+1];//각 동전의 갯수
		d = new int [k+1][t+1];//다이나믹 배열
		for(int i=1; i<=k; i++){
			p[i] = kbd.nextInt();
			n[i] = kbd.nextInt();
		}
		d[0][0] = 1;
		
		for(int i=1; i<=k; i++)
			d[i][0] = 1;//j위치에서 현재 동전 금액을 뺀 곳의 값을 참조함
		
		for(int i=0; i<k+1; i++)
			System.out.println("p] "+i+" :"+p[i]);
		
		for(int i=0; i<k+1; i++)
			System.out.println("n] "+i+" :"+n[i]);
		
		
		for(int i=0; i<k+1; i++)
			for(int j=0; j<t+1; j++)
				System.out.println("d] "+i+" "+j+" :"+d[i][j]);
		
		System.out.println(d[k][t]);
		
	}
	public static void calcCoin(){
		for(int i=1; i<=k; i++){
			for(int j=1; j<=t; j++){
				//이전 동전이 만든 잔돈과
				//내가 만들 잔돈을 더해 줌
				//잔돈을 만들 수 있는 케이스가 합쳐진다
				for(int a=0; a<=n[i]; a++){
					if(p[i]*a > j) break;
					d[i][j] += d[i-1][j-p[i]*a];
				}
			}
		}
	}
}
