import java.util.Scanner;

public class car {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max_d=sc.nextInt();//거리
		int center=sc.nextInt();
		int[]d=new int [center+1];
		int total_d=0;
		int[]time=new int [center];
		int t=0;
		int min_time=0,count=0;
		int[]visit =new int[center+1];
		for(int i=0;i<d.length;i++){
			d[i]=sc.nextInt();
			total_d+=d[i];
		}//정비소사이거리
		for(int i=0;i<time.length;i++){
			time[i]=sc.nextInt();
		}//정비시간
		int i=0;
		if(total_d<max_d){
			System.out.println("0");
		}else{
			while(true){
			for(i=1;i<d.length;i++){
				if(d[i-1]+d[i]<=max_d){
					if(time[i-1]<time[i]){
						min_time+=time[i-1];
						visit[i]=i;
						count++;
						
					}else{
						min_time+=time[i];
						visit[i]=i+1;
						count++;
						i++;
					}
				}
				else if(d[i-1]<max_d){
					min_time+=time[i-1];
					visit[i]=i;
					count++;
				}
			}break;
			}
		
		System.out.println(min_time);
		System.out.println(count);
		for(int j=0;j<visit.length;j++){
			if(visit[j]!=0){
				System.out.print(visit[j]+" ");
			}
		}
		
		}
		
	}	

}
