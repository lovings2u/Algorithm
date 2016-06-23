import java.util.Scanner;
import java.io.FileInputStream;
public class frog_jump {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int test_case;
		for(test_case=1; test_case <= TC; test_case++){
			int n = sc.nextInt();
			int a[] = new int[n+1];
			a[0] = 0;
			for(int i=1; i<n+1; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			
			int max_gap = 0;
			for(int i=0; i<n; i++){
				if(max_gap < a[i+1] - a[i])
					max_gap = a[i+1] - a[i];
			}
			
			System.out.println("Case #"+test_case);
			if(max_gap > k)
				System.out.println(-1);
			else{
				int count = 0;
				for(int i=0, j=i+1 ; i<n && j<n+1 ;){
						if(a[j]-a[i]<= k)
							j++;
						else{
							i = j-1;
							count++;
						}
				}
				System.out.println(count+1);
			}
		}
	}
}
