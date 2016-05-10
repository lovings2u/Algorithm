package java0511;
import java.util.Scanner;

public class fill{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float speed=sc.nextFloat();
		int weight=sc.nextInt();
		int power=sc.nextInt();
		String result="";
		
		if((speed<=4.5)&&(weight>=150)&&(power>=200)){
			result +="Wide Receiver";
		}
		if((speed<=6.0)&&(weight>=300)&&(power>=500)){
			result +="Lineman";
		}if((speed<=5)&&(weight>=200)&&(power>=300)){
			result +="Quarterback";
		}
                else {if(result=="")

                         result="No positions";}
		
		System.out.println(result);

	}}

