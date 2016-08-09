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
				box[i][j]=sc.nextInt();//�丶��ֱ� -1.0.1��//
				if(box[i][j]==1){
					qx.add(i);//���� �丶�� ť���ֱ� ���ȣ ť���ֱ�
					qy.add(j);//�����丶���� ����ȣ ť���ֱ�
				}				
				if(
					box[i][j]==0){visited[i][j]=false;//������ �丶��� �鷯�� �ϹǷ� false
				}else{
					visited[i][j]=true;//�;��ų� ������ �湮�� �ʿ䰡 �����Ƿ� true	
					count1++;}
				if(box[i][j]==0||box[i][j]==-1){
					count2++;}//�����丶�䰡 ���;��ų� ��������� ����������
				}			
			}
		if(count1==n*m){qx=null;qy=null;result=0;}//���� �����丶�䰡 ������ 0����ؾ���
		if(count2==n*m){qx=null;qy=null;result=-1;}//������ ���� ���� -1 ����ؾ���
		//���� ��Ȳ�̸� �ݺ��� �����ʿ� �����Ƿ� ť null
		
		while(qx!=null&&qy!=null){//ť ���� �ٻ���Ҷ����� �ݺ���,�� ť�� ���빰�� ������ �����°�.
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


