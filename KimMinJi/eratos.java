import java.util.Scanner;

public class eratos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt(),check=0,m=1;
		boolean[] visit = new boolean[n+1];//�ε����� ���ڸ� ���߱� ���ؼ� n+1���� �迭�� �ʱ�ȭ
		int[] num= new int [n+1];
		for(int i=0;i<=n;i++){
			visit[i]=false;
			num[i]=i;
		}// �迭�� ���� false���� 
		for(int i=2;i<n;i++){
			for(int j=1;j<n;j++){
				m=i*j;
				if(m>n){break;}
				if(visit[m]==false){
				visit[m]=true;check++;}
				if(check==k){break;}}
			if(check==k){break;}
		}
		for(int i=1;i<n;i++){
			if(num[i]==m){
				break;
			}
		}
		System.out.println(num[m]);

}
}