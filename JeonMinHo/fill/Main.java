package fill;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		int w = sc.nextInt();
		int p = sc.nextInt();
		String wi = wideReceiver(s,w,p);
		String l = lineMan(s,w,p);
		String q = quarterBack(s,w,p);
		String n = "No positions";
		if(wi != "" || l != "" || q != "")
			n = "";
		System.out.println(wi + l + q + n);
	}
	static String wideReceiver(double speed, int weight, int power){
		if(speed <= 4.5 && weight >= 150 && power >=200) 
			return "Wide Receiver ";
		else 
			return "";
	}
	static String lineMan(double speed, int weight, int power){
		if(speed <= 6.0 && weight >= 300 && power >=500) 
			return "Lineman ";
		else 
			return "";
	}
	
	static String quarterBack(double speed, int weight, int power){
		if(speed <= 5.0 && weight >= 200 && power >=300) 
			return "Quarterback ";
		else 
			return "";
	}
	static String noPosition(double speed, int weight, int power) {
		if(speed > 6.0 && weight < 150 || power <= 200) 
			return "No positions ";
		else 
			return "";
	}
}
