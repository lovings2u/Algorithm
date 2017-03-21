package JungOl;

import java.util.Scanner;

public class Q1111findingWayToHike {
	int mnt[][], cost[][];
	int n = 0;
	int targetX = 0, targetY = 0;
	public static void main(String[] args) {new Q1111findingWayToHike();}
	public Q1111findingWayToHike() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		mnt = new int[n+2][n+2];
		cost = new int[n+2][n+2];
		targetX = sc.nextInt();
		targetY = sc.nextInt();
		for(int i = 1; i<n+1; i++){
			for(int j = 1; j<n+1; j++){
				mnt[i][j] = sc.nextInt();
				cost[i][j] = 9999999;
			}
		}
		sc.close();
		printMNT();
		printCost();
		costUpdate();
		printCost();
		costUpdate();
		printCost();
	}
	
	private void costUpdate() {
		for(int i = 1; i<n+1; i++){
			for(int j = 1; j<n+1; j++){
				cost[i][j] = calculateCost(i, j);
			}
		}
	}
	
	private int calculateCost(int x, int y) {
		int min  = cost[x][y];
		System.out.println(x+"//"+y);
		//
		//위에서 올 때
		if(mnt[x-1][y] > mnt[x][y]){
			int currentCost = (mnt[x-1][y] - mnt[x][y]) * (mnt[x-1][y] - mnt[x][y]);
			System.out.println("Top.currentCost : "+currentCost);
			if(cost[x-1][y]+currentCost < min){
				min = cost[x-1][y]+currentCost;
				System.out.println("Top.min : "+min);
			}
		}
		else{
			int currentCost = Math.abs(mnt[x][y] - mnt[x-1][y]);
			System.out.println("Top.currentCost : "+currentCost);
			if(cost[x-1][y]+currentCost < min){
				min = cost[x-1][y]+currentCost;
				System.out.println("Top.min : "+min);
			}
		}
		//
		//아래에서 올 때
		if(mnt[x+1][y] > mnt[x][y]){
			int currentCost = (mnt[x+1][y] - mnt[x][y]) * (mnt[x+1][y] - mnt[x][y]);
			System.out.println("Bot.currentCost : "+currentCost);
			if(cost[x+1][y]+currentCost < min){
				min = cost[x+1][y]+currentCost;
				System.out.println("Bot.min : "+min);
			}
		}
		else{
			int currentCost = Math.abs(mnt[x][y] - mnt[x+1][y]);
			System.out.println("Bot.currentCost : "+currentCost);
			if(cost[x+1][y]+currentCost < min){
				min = cost[x+1][y]+currentCost;
				System.out.println("Bot.min : "+min);
			}
		}
		//
		//from Left
		if(mnt[x][y-1] > mnt[x][y]){
			int currentCost = (mnt[x][y-1] - mnt[x][y]) * (mnt[x][y-1] - mnt[x][y]);
			System.out.println("Left.currentCost : "+currentCost);
			if(cost[x][y-1]+currentCost < min){
				min = cost[x][y-1]+currentCost;
				System.out.println("Left.min : "+min);
			}
		}
		else{
			int currentCost = Math.abs(mnt[x][y] - mnt[x][y-1]);
			System.out.println("Left.currentCost : "+currentCost);
			if(cost[x][y-1]+currentCost < min){
				min = cost[x][y-1]+currentCost;
				System.out.println("Left.min : "+min);
			}
		}

		//
		//from Right
		if(mnt[x][y+1] > mnt[x][y]){
			int currentCost = (mnt[x][y+1] - mnt[x][y]) * (mnt[x][y+1] - mnt[x][y]);
			System.out.println("Right.currentCost : "+currentCost);
			if(cost[x][y+1]+currentCost < min){
				min = cost[x][y+1]+currentCost;
				System.out.println("Right.min : "+min);
			}
		}
		else{
			int currentCost = Math.abs(mnt[x][y] - mnt[x][y+1]);
			System.out.println("Right.currentCost : "+currentCost);
			if(cost[x][y+1]+currentCost < min){
				min = cost[x][y+1]+currentCost;
				System.out.println("Right.min : "+min);
			}
		}
		System.out.println("min : "+min+"\n");
		return min;
	}

	private void printMNT() {
		System.out.println("MNT ------------");
		for(int i = 0; i<n+2; i++){
			for(int j = 0; j<n+2; j++){
				System.out.print(mnt[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	private void printCost() {
		System.out.println("\nCOST ------------");
		for(int i = 0; i<n+2; i++){
			for(int j = 0; j<n+2; j++){
				System.out.print(cost[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
