import java.util.Scanner;
public class midp {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int arr[] = new int[n];	
		for(int i=0; i<n; i++){
			x[i] = kbd.nextInt()%2;
			y[i] = kbd.nextInt()%2;
			arr[i] = x[i]*2 + y[i];
		}
		
		int count = 0;
		int case1 = 0;
		int case2 = 0;
		int case3 = 0;
		int case4 = 0;
		int i=0;
		while(i<n){
			switch(arr[i]){
			case 0:
				case1++;
				break;
			case 1:
				case2++;
				break;
			case 2:
				case3++;
				break;
			case 3:
				case4++;
				break;
			}
			i++;
		}
		count += ((case1-1)*case1)/2;
		count += ((case2-1)*case2)/2;
		count += ((case3-1)*case3)/2;
		count += ((case4-1)*case4)/2;
		
		System.out.println(count);
	}
}
