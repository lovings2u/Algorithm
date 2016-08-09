import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tomato2 {
	Scanner sc = new Scanner(System.in);

	private static int[][]box;
	private static boolean[][] visited;
	private static Queue qx;
	private static Queue qy;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		box= new int [n][m];
		visited=new boolean[n][m];
		qx=new LinkedList();
		qy=new LinkedList();
		int count1=0,result=0,count2=0,count=0;
		int x,y;
		for(int i=0;i<box.length;i++){
			for(int j=0;j<box[i].length;j++){
				box[i][j]=sc.nextInt();//토마토넣기 -1.0.1로//
				if(box[i][j]==1){
					qx.add(i);//익은 토마토 큐에넣기 행번호 큐에넣기
					qy.add(j);//익은토마토의 열번호 큐에넣기
				}				
				if(
					box[i][j]==0){visited[i][j]=false;//덜익은 토마토는 들러야 하므로 false
				}else{
					visited[i][j]=true;//익었거나 없으면 방문할 필요가 없으므로 true	
					count1++;}
				if(box[i][j]==0||box[i][j]==-1){
					count2++;}//들어온토마토가 안익었거나 비어있으면 익을수없음
				}			
			}
		if(count1==n*m){qx=null;qy=null;result=0;}//전부 익은토마토가 들어오면 0출력해야함
		if(count2==n*m){qx=null;qy=null;result=-1;}//익을수 없는 경우면 -1 출력해야함
		//위의 상황이면 반복문 돌릴필요 없으므로 큐 null
		
		while(qx!=null&&qy!=null){//큐 전부 다사용할때까지 반복함,즉 큐의 내용물이 있으면 돌리는것.
			x=(int)qx.poll();
			y=(int)qy.poll();
			if(box[x+1][y]==0&&x+1<m){
				qx.add(x+1);
				qy.add(y);}
			if(box[x][y+1]==0&&y+1<n){
				qx.add(x);
				qy.add(y+1);}
			if(box[x-1][y]==0&&x-1>-1){
				qx.add(x-1);
				qy.add(y);}
			if(box[x][y-1]==0&&y-1>-1){
				qx.add(x);
				qy.add(y-1);}
			count++;
		}
		
		System.out.println(count>0?count:result);
		
		
	}		
}


