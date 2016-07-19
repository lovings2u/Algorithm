import java.util.Arrays;
import java.util.Scanner;

public class tps {
	public static int [][]mst;
	public static boolean[] visit;
	public static int maxlength;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int city=sc.nextInt();
		mst = new int [city][city];
		maxlength=mst.length;
		visit=new boolean [maxlength];
		
		for(int i=0;i<maxlength;i++){
			for(int j=0;j<mst[i].length;j++){
				mst[i][j]=sc.nextInt();}}//가중치 입력
		visit();
		mst(0,0);
			
	}
	public static void visit(){
		for(int i=0;i<maxlength;i++){
			visit[i]=false;//방문전이므로 전부 false로 세팅
		}
	}
	public static void mst(int a,int sum){
		int min=-1;
		int i,index=0;
		visit[a]=true;//방문한 엣지는 true로 변경
		for(i=0;i<maxlength;i++){
			if(!visit[i]&&mst[a][i]!=0){
			min=Math.min(min, mst[a][i]);}}
		
		for(i=0;i<maxlength;i++){
			if(min==mst[a][i])
			index=i;break;}
		
		for(i=0;i<maxlength;i++){
			if(!visit[i]){
				sum+=min;
				mst(index,sum);}}
		
		sum+=mst[i][0];		
		System.out.println(sum);
	}	
}

