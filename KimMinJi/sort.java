import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]kids=new int [n];
		int max=-1;
		int count=1;
		for(int i=0;i<n;i++){
			kids[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			count=1;
			//kids[i]는 고정값이되고 kids[j]만 바꿔가며 값 비교..쁑,오름차순이어야하므로 이전거의합보다 이후값의 합이 더 커야함ㅇㅇ
			for(int j=i;j<n;j++){
				if(j-1>=0&&kids[j-1]<kids[j]&&kids[i]+kids[j-1]<kids[i]+kids[j]){
					count++;//최대오름차순 개수
				}				
			}
			if(max<count){
				max=count;
			}
		}
		System.out.println(n-max);		
	}
}
