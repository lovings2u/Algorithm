import java.util.Scanner;

public class insubunE {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int i,d=a*a-4*b;//d�� �Ǻ���
		
		for(i=1;i<1100;i++){
			if(d<0){
				System.out.println("impossible");//�Ǻ���,����̸� �Ұ���
				break;}
			else if(d==0){i=0;break;}//d===0�̸� �����������̱� ������ i�� 0�̾ i=0���� �ʱ�ȭ(1���ͽ����ؼ�)
			else if((double)d/i==(int)i){//�Ǻ����� ���������� ���� �����γ���
					break;}
		}
		if(i<1100){System.out.println("(x-"+((a-i)/2)+")(x-"+((a+i)/2)+")");}//for�����ش�
		else{System.out.println("impossible");}//for���� �ش��̾ȵǸ� ���� impossible
}}
