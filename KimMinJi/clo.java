import java.util.Scanner;

public class clo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		double m;
		
		//입력한 시간의 시침위치 (360/12)*h
		//븐침이 1분에 360/60씩감  1분에 6도씩 이동
		//시침은 1시간에 30도움직임
		//그럼 시침은 1분에 60/30 0.5도 움직임
		//분침6m이랑 시침30h+1/2m이 같아야함
		
		m=(60/11)*h;
		
		if(h==12){System.out.println("0.000000");}
		else{
			if(m<5*h){
				System.out.printf("%.6h",m);
			}else{
				System.out.println("CAN'T SEE!");}
			
		}

	}

}
