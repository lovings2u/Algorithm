import java.util.Scanner;
import java.io.FileInputStream;

class frogjump {
	public static void main(String args[]) throws Exception	{
		/* �Ʒ� �޼ҵ� ȣ���� ������ ǥ���Է�(Ű����) ��� input.txt ���Ϸ� ���� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   ���� ������ PC ���� �׽�Ʈ �� ����, �Է°��� input.txt�� ������ �� �� �ڵ带 ù �κп� ����ϸ�,
		   ǥ���Է� ��� input.txt ���Ϸ� ���� �Է°��� �о� �� �� �ֽ��ϴ�.
		   ����, ���� PC���� �Ʒ� �޼ҵ带 ������� �ʰ� ǥ���Է��� ����Ͽ� �׽�Ʈ�ϼŵ� �����մϴ�.
		   ��, Codeground �ý��ۿ��� "�����ϱ�" �� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ�(//) ó�� �ϼž� �մϴ�. */
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
        
		Scanner sc = new Scanner(System.in);

		int TC;//�׽�Ʈ����
		int test_case;//���� ���° �׽�Ʈ����
        int n,k,i,jump=0,max=0,sum=0;//�Է¹��� ������,�����Ÿ�,���


		TC = sc.nextInt();//�׽�Ʈ���� �Է¹���
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