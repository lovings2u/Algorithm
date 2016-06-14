package study0614;

import java.util.Scanner;

public class coci_sok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*
		int o = sc.nextInt(); //오렌지
		int p = sc.nextInt(); //파인애플
		int a = sc.nextInt(); //사과
		
		int ro = sc.nextInt(); //오렌지 비율
		int rp = sc.nextInt(); //파인애플 비율
		int ra = sc.nextInt(); //사과비율
	*/
		double o = sc.nextDouble();
		double p = sc.nextDouble();
		double a = sc.nextDouble();
		double ro = sc.nextDouble();
		double rp = sc.nextDouble();
		double ra = sc.nextDouble();

		
		double fo; double fp; double fa; //결과
		
		double g=0; 
		
		if(ro==rp&&rp==ra){//비율이 1:1:1인 경우
		
			if(o<=p&&o<=a){ //오렌지 개수가 제일 적으면
				fo=o-o;
				fp=p-o;
				fa=a-o;
			}
			else if(p<=o&&p<=a){ //파인애플이
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

			
			//세 과일 중 두개의 과일의 최대공약수
			if(ro>rp) g=gcd((int)ro,(int)rp);
			else g=gcd((int)rp,(int)ro);
		
			if(ra%g==0){ //이 경우에만 세수의 공통 약수로 약분 가능
				ro=ro/g; rp=rp/g; ra=ra/g;
			}
		
			//개수 - 비율이 가장 작은 것을 기준
			double subo = o-ro;  double subp = p-rp;  double suba = a-ra;
		
			if(subo<=subp&&subo<=suba){ //오렌지 기준
				double div = (double)o/ro;
				fo=o-(div*ro);
				fp=p-(div*rp);
				fa=a-(div*ra);		
			}
			else if(subp<=subo&&subp<=suba){ //파인애플기준
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
