import java.util.Scanner;

public class complete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int com=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				com+=i;//����������� ����ϱ� ����
			}
		}
		if(n!=1&&com==n){//���ѰŶ� �Է��ѰŶ� �������� �������ϱ�,1�� ���� 
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
