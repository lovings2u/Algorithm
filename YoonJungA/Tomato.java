package c0809;

import java.util.ArrayList;
import java.util.Scanner;

public class Tomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String ok = "true";
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int box[][] = new int[M][N];
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
				box[i][j]=sc.nextInt();
		
		int visit[][] = new int[M][N];
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
				visit[i][j]=0; //방문한거면 1, 아니면 0
		
		
		Queue Q_X = new Queue(); //x 좌표
		Queue Q_Y = new Queue(); //y 좌표
		
	
			for(int i=0;i<M;i++){
				for(int j=0;j<N;j++){
					if(box[i][j]==1&&visit[i][j]==0){
						Q_X.push(i);
						Q_Y.push(j);
						visit[i][j]=1;
					}
				}
			}
			
			int count = Q_X.alist.size();
			int day=0;
			
			
			while(Q_X.alist.size()!=0){
			
			count--;
				

			int x = Q_X.alist.get(0); //큐맨앞에있는
			int y = Q_Y.alist.get(0);
			Q_X.pop();
			Q_Y.pop();
			
			//상
			if(y-1>=0 && visit[x][y-1]==0 && box[x][y-1]==0){
				box[x][y-1]=1;
				visit[x][y-1]=1;
				Q_X.push(x);
				Q_Y.push(y-1);
			}
			
			//하
			if(y+1<N && visit[x][y+1]==0 && box[x][y+1]==0){
				box[x][y+1]=1;
				visit[x][y+1]=1;
				Q_X.push(x);
				Q_Y.push(y+1);
			}
			
			//좌
			if(x-1>=0 && visit[x-1][y]==0 && box[x-1][y]==0){
				box[x-1][y]=1;
				visit[x-1][y]=1;
				Q_X.push(x-1);
				Q_Y.push(y);
			}
			
			//우
			if(x+1<M && visit[x+1][y]==0 && box[x+1][y]==0){
				box[x+1][y]=1;
				visit[x+1][y]=1;
				Q_X.push(x+1);
				Q_Y.push(y);
			}
			
			if(count==0){
				count=Q_X.alist.size();
				day++;
			}
		
		}
			for(int i=0;i<M;i++){
				for(int j=0;j<N;j++){
					if(box[i][j]==0) ok="false";
				}
			}
			if(ok.equals("true")) System.out.println(day-1);
			else System.out.println(-1);
			
	}
}

class Queue{
	
	ArrayList<Integer> alist = new ArrayList();
	
	public Queue(){
		
	}
	public void push(int a){
		alist.add(a);
	}
	public void pop(){
		alist.remove(0);
	}
	
}

