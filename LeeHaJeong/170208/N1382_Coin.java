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
		t = kbd.nextInt();//���� �ݾ�
		k = kbd.nextInt();//���� ������
		p = new int[k+1];//�� ������ �ݾ�
		n = new int[k+1];//�� ������ ����
		d = new int [k+1][t+1];//���̳��� �迭
		for(int i=1; i<=k; i++){
			p[i] = kbd.nextInt();
			n[i] = kbd.nextInt();
		}
		d[0][0] = 1;
		
		for(int i=1; i<=k; i++)
			d[i][0] = 1;//j��ġ���� ���� ���� �ݾ��� �� ���� ���� ������
		
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
				//���� ������ ���� �ܵ���
				//���� ���� �ܵ��� ���� ��
				//�ܵ��� ���� �� �ִ� ���̽��� ��������
				for(int a=0; a<=n[i]; a++){
					if(p[i]*a > j) break;
					d[i][j] += d[i-1][j-p[i]*a];
				}
			}
		}
	}
}
