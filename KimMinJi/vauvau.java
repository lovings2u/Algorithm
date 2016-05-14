import java.util.Scanner;

public class vauvau {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,p,m,g;
		int count_p=0,count_m=0,count_g=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		p=sc.nextInt();
		m=sc.nextInt();
		g=sc.nextInt();
		String result_p="none",result_m="none",result_g="none";
		
		if(p%(a+b)>a||p%(a+b)==0){}
		else{count_p++;}
		if(p%(c+d)>c||p%(c+d)==0){}
		else{count_p++;}
		
		if(m%(a+b)>a||m%(a+b)==0){}
		else{count_m++;}
		if(m%(c+d)>c||m%(c+d)==0){}
		else{count_m++;}
		
		if(g%(a+b)>a||g%(a+b)==0){}
		else{count_g++;}
		if(g%(c+d)>c||g%(c+d)==0){}
		else{count_g++;}
		
		if(count_p==2){result_p="both";}
		else if(count_p==1){result_p="one";}
		if(count_m==2){result_m="both";}
		else if(count_m==1){result_m="one";}
		if(count_g==2){result_g="both";}
		else if(count_g==1){result_g="one";}
		System.out.println(result_p);
		System.out.println(result_m);
		System.out.println(result_g);
}	
}
