import java.util.Scanner;

public class coci_jabuka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red=sc.nextInt(),blue=sc.nextInt();
		int i;
		for(i=1;i<=Math.min(red, blue);i++){
			if(red%i==0&&blue%i==0){
				System.out.println(i+" "+red/i+" "+blue/i);
			}
		}
	}
}
