import java.util.Scanner;

public class monitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int person=sc.nextInt();//�����
		double ax=sc.nextDouble(),ay=sc.nextDouble();//1�����̴� ��ǥ
		double bx=sc.nextDouble(),by=sc.nextDouble();//2�����̴� ��ǥ
		double area=sc.nextDouble();//���̴����� area_a,area_b;
		double[]x=new double [person];
		double[]y=new double [person];
		double[]a_dis=new double[person];
		double[]b_dis=new double[person];
		int rr,r_a=0,r_b,count=0;
		for(int i=0;i<person;i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();//��ǥ ���� �Է¹ޱ�
			a_dis[i]=Math.sqrt(Math.pow((ax-x[i]), 2)-Math.pow(ay-y[i], 2));
			if(a_dis[i]<0){a_dis[i]*=-1;}//a�� �Է¹��� ��ǥ ���������� �Ÿ����ϱ�
			b_dis[i]=Math.sqrt(Math.pow((bx-x[i]), 2)-Math.pow(by-y[i], 2));
			if(b_dis[i]<0){b_dis[i]*=-1;}//b�� �Է¹��� ��ǥ ���������� �Ÿ����ϱ�
			
		}
		
		rr=(int)Math.sqrt((area/3.141)); //area�� ������ �Ǵ� �Ÿ��� �̿��ؼ� ���ҿ���
		while(r_a<rr){
			for(int i=0;i<person;i++){
				r_b=rr-r_a;
				if(r_a>=a_dis[i]){count++;}//a������ �ɸ��� +1
				else if(r_b>=b_dis[i]){count++;}//b������ �ɸ��� +1
			}r_a++;
			
		}
		
		
		System.out.println(person-count);//���ø��ϴ� ����� ���ϱ� ��ü������� ���̴����ɸ��������
		
		
	}

}
