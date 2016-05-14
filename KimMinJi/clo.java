import java.util.Scanner;

public class clo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		double m;
		
	
		
		m=(double)(60/11)*h;
		
		if(h==12){System.out.println("0.000000");}
		else{
			if(m<5*h+5){
				System.out.printf("%.6h",m);
			}else{
				System.out.println("CAN'T SEE!");}
			
		}

	}

}
