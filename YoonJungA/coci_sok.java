package study0614;

import java.util.Scanner;

public class coci_sok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*
		int o = sc.nextInt(); //������
		int p = sc.nextInt(); //���ξ���
		int a = sc.nextInt(); //���
		
		int ro = sc.nextInt(); //������ ����
		int rp = sc.nextInt(); //���ξ��� ����
		int ra = sc.nextInt(); //�������
	*/
		double o = sc.nextDouble();
		double p = sc.nextDouble();
		double a = sc.nextDouble();
		double ro = sc.nextDouble();
		double rp = sc.nextDouble();
		double ra = sc.nextDouble();

		
		double fo; double fp; double fa; //���
		
		double g=0; 
		
		if(ro==rp&&rp==ra){//������ 1:1:1�� ���
		
			if(o<=p&&o<=a){ //������ ������ ���� ������
				fo=o-o;
				fp=p-o;
				fa=a-o;
			}
			else if(p<=o&&p<=a){ //���ξ�����
				fo=o-p;
				fp=p-p;
				fa=a-p;
			}
			else{
				fo=o-a;
				fp=p-a;
				fa=a-a;
			}
		}
		
		else{

			
			//�� ���� �� �ΰ��� ������ �ִ�����
			if(ro>rp) g=gcd((int)ro,(int)rp);
			else g=gcd((int)rp,(int)ro);
		
			if(ra%g==0){ //�� ��쿡�� ������ ���� ����� ��� ����
				ro=ro/g; rp=rp/g; ra=ra/g;
			}
		
			//���� - ������ ���� ���� ���� ����
			double subo = o-ro;  double subp = p-rp;  double suba = a-ra;
		
			if(subo<=subp&&subo<=suba){ //������ ����
				double div = (double)o/ro;
				fo=o-(div*ro);
				fp=p-(div*rp);
				fa=a-(div*ra);		
			}
			else if(subp<=subo&&subp<=suba){ //���ξ��ñ���
				double div = (double)p/rp;
				fo=o-(div*ro);
				fp=p-(div*rp);
				fa=a-(div*ra);
			}
			else{
				double div = (double)a/ra;
				fo=o-(div*ro);
				fp=p-(div*rp);
				fa=a-(div*ra);	
			}
		}
		
		System.out.println(fo+" "+fp+" "+fa);
		
		
		}
		public static double gcd(int i, int j){
			int mod = i%j;
			while(mod>0){
				i=j; j=mod; mod=i%j;
			}
			return j*1.000000;
		}
	}
