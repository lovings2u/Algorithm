import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=1,count=0,f,tobinaryint,tobinaryshift;
		String tobinary,luckynum,luckynum2;
	
		//���׷쿡 ���ϴ��� �˾ƺ������� while��
		while(true){
			if((int)Math.pow(2, n)-1<=num&&num<(int)(Math.pow(2, n+1)-1)){
				break;
			}n++;
		}
		//�ڱ� �׷쿡���� ������ 2^n-1�̰� ���������� 2^n+1-2
		f=(int)Math.pow(2, n)-1;//f�� �������� ����
		for(int i=0;i<(int)Math.pow(2, n);i++){
			if(f==num){
				break;//�Է��� ���� �׷쿡�� ���° �ڸ����� �˾Ƴ��� ���� for��
			}f++;count++;
		}
		tobinary=Integer.toBinaryString(count);//�ڸ� �˾Ƴ����� 2������ ��ȯ
		if(count<(Math.pow(2, n))/2){//����Ʈ �����ڰ� �ʿ��Ѿ��̵�
			tobinaryint=Integer.parseInt(tobinary);//����Ʈ�����ڴ� �������� �����ϹǷ� ��Ʈ���� �ٽ� ������
			tobinaryshift=tobinaryint>>>n-1;//����Ʈ�����ڽ���
			tobinary=Integer.toBinaryString(tobinaryshift);//�ٽ� ��Ʈ��
			luckynum=tobinary.replace("0", "4");//0�� 4�� �ٲ�
			luckynum2=luckynum.replace("1", "7");//1�� 7�� �ٲ�	
			
		}//����Ʈ �����ڰ� �ʿ��� �κп����� ������ ���׿� �ФФФФФФФ�
		else{
		luckynum=tobinary.replace("0", "4");//0�� 4�� �ٲ�
		luckynum2=luckynum.replace("1", "7");//1�� 7�� �ٲ�
		}
		System.out.println(luckynum2);
		
		
		
	}

}
