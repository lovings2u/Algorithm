package j510;

import java.util.Scanner;

public class tiless {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int w,h;
		int whole=0,part=0;
		
		w=sc.nextInt();
		h=sc.nextInt();
		
		whole=(w/8)*(h/8);
		if((w%8!=0)&&(h%8!=0)){part=(w/8)+(h/8)+1;}
		else if(w%8 !=0){part=h/8;}
		else if (h%8 !=0){part=w/8;}
		else if ((w%8==0)&&(h%8==0)){part=0;}
		
		System.out.println("The number of whole tiles is "+whole+" part tiles is "+part);
		
}
	}