import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]kids=new int [n];
		int max=-1;
		int count=1;
		for(int i=0;i<n;i++){
			kids[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			count=1;
			//kids[i]�� �������̵ǰ� kids[j]�� �ٲ㰡�� �� ��..��,���������̾���ϹǷ� ���������պ��� ���İ��� ���� �� Ŀ���Ԥ���
			for(int j=i;j<n;j++){
				if(j-1>=0&&kids[j-1]<kids[j]&&kids[i]+kids[j-1]<kids[i]+kids[j]){
					count++;//�ִ�������� ����
				}				
			}
			if(max<count){
				max=count;
			}
		}
		System.out.println(n-max);		
	}
}
