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
				break;}//�Է��Ѽ��ڰ� 1����c������ ���̸� �ٴ��� c,������1
			else if((c*(c+1))/2<n&&n<((c+1)*(c+2))/2){
				b=c+1;//�з��Ѽ��ڰ� 1~c������ �հ� 1~(c+1)�������̸� �ٴ��� c+1��
				t=n;//n��t������
				for(i=b;i>0;i--){//u�����ϱ� ���� �ݺ�������
					t-=i;//t�� �볪�� i����ŭ ���� ��������.
					s+=i;//����� �볪�� ���� üũ
					if(t>0&&s==n){//�볪���� �Է��Ѱ�����ŭ �̹̻�����ߴµ� t��>0�ΰ��
						u=n-((c*(c+1))/2);//u�ǰ����� ��ü���� c������ �����A��
						break;//ex 18�Է�
					}
					else if(t==0){//t�� 0�ΰ��
						u=i;//u�� i�� ex 20�Է�
						break;
					}else if(t<0){
						u=n-s+i;//t�� 0���� �������°�� ex100
						break;}}//
				
				break;}			
			c++;}		
		System.out.println(b+" "+u);
	}
}
