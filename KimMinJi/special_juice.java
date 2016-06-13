import java.util.Scanner;

public class special_juice {//망...

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] fruits= new double[3];
		int [] rate= new int[3];
		int i,max=0;
		
		for(i=0;i<3;i++){//주스 용량 입력
			fruits[i]=sc.nextInt();
		}
		for(i=0;i<3;i++){//주스 비율 입력하고 제일 큰 비율 하나 max에 입력
			rate[i]=sc.nextInt();
			max=(int)Math.max(max, rate[i]);
		}
		
		
		while(fruits[0]!=0||fruits[1]!=0||fruits[2]!=0){//주스용량 하나라도 0되면 반복종료
			fruits[0]-=(double)(rate[0]/max);//주스용량에서 비율을 빼준다
			fruits[1]-=(double)(rate[1]/max);
			fruits[2]-=(double)(rate[2]/max);
			
		}
		System.out.println(fruits[0]+" "+fruits[1]+" "+fruits[2]);//주스옹량출력


	}

}
