import java.util.Scanner;

public class monitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int person=sc.nextInt();//사람수
		double ax=sc.nextDouble(),ay=sc.nextDouble();//1번레이더 좌표
		double bx=sc.nextDouble(),by=sc.nextDouble();//2번레이더 좌표
		double area=sc.nextDouble();//레이더널이 area_a,area_b;
		double[]x=new double [person];
		double[]y=new double [person];
		double[]a_dis=new double[person];
		double[]b_dis=new double[person];
		int rr,r_a=0,r_b,count=0;
		for(int i=0;i<person;i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();//좌표 각각 입력받기
			a_dis[i]=Math.sqrt(Math.pow((ax-x[i]), 2)-Math.pow(ay-y[i], 2));
			if(a_dis[i]<0){a_dis[i]*=-1;}//a와 입력받은 좌표 두점사이의 거리구하기
			b_dis[i]=Math.sqrt(Math.pow((bx-x[i]), 2)-Math.pow(by-y[i], 2));
			if(b_dis[i]<0){b_dis[i]*=-1;}//b와 입력받은 좌표 두점사이의 거리구하기
			
		}
		
		rr=(int)Math.sqrt((area/3.141)); //area가 나오게 되는 거리를 이용해서 구할예쩡
		while(r_a<rr){
			for(int i=0;i<person;i++){
				r_b=rr-r_a;
				if(r_a>=a_dis[i]){count++;}//a영역에 걸리면 +1
				else if(r_b>=b_dis[i]){count++;}//b영역에 걸리면 +1
			}r_a++;
			
		}
		
		
		System.out.println(person-count);//감시못하는 사람의 수니까 전체사람에서 레이더에걸린사람뺴줌
		
		
	}

}
