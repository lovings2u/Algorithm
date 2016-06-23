import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num []= new int[41];
		int i = 0;
		int garo, sero = 0;
		while(true){
			num[i] = kbd.nextInt();
			if(num[i]<2)
				break;
			i++;
		}
		for(int j=0; j<i; j++){
			System.out.println("Case #"+(j+1)+":");
			if(num[j]%2 == 1){
				garo = fibo(num[j]) + fibo(num[j]-1);
				sero = fibo(num[j]);
			}else{
				garo = fibo(num[j]);
				sero = fibo(num[j]) + fibo(num[j]-1);
			}
			System.out.println(sero+", "+garo+"\n");	
		}
	}
	public static int fibo(int n){
		if(n==1 || n==2)
			return 1;
		else
			return fibo(n-1)+ fibo(n-2);
	}
}
