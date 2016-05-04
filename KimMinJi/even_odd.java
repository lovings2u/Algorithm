package j510;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		String p1,p2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		String[] s1={"even","odd"};
				
		if(n1%2==0){
			p1=s1[0];}
		else{p1=s1[1];}
		if(n2%2==0){
			p2=s1[0];}
		else{p2=s1[1];}
		
		if(((n1%2==0)&&(n2%2==0))||((n1%2==1)&&(n2%2==1))){
			System.out.println(p1+"+"+p2+"=even");
		}else{System.out.println(p1+"+"+p2+"=odd");}
		if((n1%2==1)&&(n2%2==1)){
			System.out.println(p1+"*"+p2+"=odd");
		}else{System.out.println(p1+"*"+p2+"=even");}

	}

}
