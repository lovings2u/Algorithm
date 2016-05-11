import java.util.Scanner;

public class profit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		float b,c;
		float price,sale;
		a=sc.nextInt();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		price=a+(a*(b/100));
		sale=price-(price*(c/100));
		//a¿ø°¡
		//System.out.println(price);
		//System.out.println(sale);
		
		if(a>sale){System.out.println("loss");}
		else{System.out.println(Math.round(sale-a));}
	}

}
