import java.util.Scanner;

public class special_juice {//��...

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] fruits= new double[3];
		int [] rate= new int[3];
		int i,max=0;
		
		for(i=0;i<3;i++){//�ֽ� �뷮 �Է�
			fruits[i]=sc.nextInt();
		}
		for(i=0;i<3;i++){//�ֽ� ���� �Է��ϰ� ���� ū ���� �ϳ� max�� �Է�
			rate[i]=sc.nextInt();
			max=(int)Math.max(max, rate[i]);
		}
		
		
		while(fruits[0]!=0||fruits[1]!=0||fruits[2]!=0){//�ֽ��뷮 �ϳ��� 0�Ǹ� �ݺ�����
			fruits[0]-=(double)(rate[0]/max);//�ֽ��뷮���� ������ ���ش�
			fruits[1]-=(double)(rate[1]/max);
			fruits[2]-=(double)(rate[2]/max);
			
		}
		System.out.println(fruits[0]+" "+fruits[1]+" "+fruits[2]);//�ֽ��˷����


	}

}
