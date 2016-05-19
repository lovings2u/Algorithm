import java.util.Arrays;
import java.util.Scanner;

public class j6174 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,a,b,c,d;
		int[] num=new int[4];
		int max,min;		
		
		while(n!=6174){
		a=n/1000;b=(n/100)%10;c=(n%100)/10;d=(n%10);
		//System.out.println(a+" "+b+" "+c+" "+d);
		num[0]=a;num[1]=b;num[2]=c;num[3]=d;
		Arrays.sort(num);
		max=num[3]*1000+num[2]*100+num[1]*10+num[0];
		min=num[0]*1000+num[1]*100+num[2]*10+num[3];
		n=max-min;
		count++;
		}
		System.out.println(count);

	}

}
