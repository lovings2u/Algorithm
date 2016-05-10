package algo;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float speed = sc.nextFloat();
		int weight = sc.nextInt();
		int p = sc.nextInt();
		String str="";
		if(speed<=4.5 && weight >=150 && p >=200){
			str = str + "Wide Receiver ";
		}if(speed<=6.0 && weight >=300 && p >=500){
			str = str + "Lineman ";
		}
		if(speed<=5.0 && weight >=200 && p >=300){
			str = str + "Quarterback ";
		}
		if(!str.equals("")){
			System.out.println(str);
		}
		else{
			System.out.println("No positions");
		}
	}
}
