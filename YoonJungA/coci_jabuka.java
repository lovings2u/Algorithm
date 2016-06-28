import java.util.Scanner;

public class coci_jabuka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int red = sc.nextInt(); 
		int blue = sc.nextInt();
		int check = gcd(red,blue); 

		for(int i=1;i<=check;i++){//최대공약수까지			
			if(red%i==0 && blue%i==0) //둘다 나누어 떨어질때만 출력
				System.out.println(i+" "+red/i+" "+blue/i);
		}
		
	}

	public static int gcd(int r, int b){
		int big = Math.max(r, b);
		int small = Math.min(r, b);
		int gcd=0;
		
		while(true){
			if(small==0){
				gcd=big;
				break;
			}
			else{
				int temp=big%small;
				big=small;
				small=temp;
			}
		}
		return gcd;
	}
}
