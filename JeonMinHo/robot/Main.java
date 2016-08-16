package robot;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	private static int[][] rail;
	private static int[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		rail = new int[m][n];
		visited = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int temp = sc.nextInt();
				rail[i][j] = temp;
				visited[i][j] = temp;
			}
		}
		
		int[] from = { sc.nextInt(), sc.nextInt() };
		int fromDir = sc.nextInt();
		
		int[] to = { sc.nextInt(), sc.nextInt() };
		int toDir = sc.nextInt();
		
		int count = 0;
		Queue<int[]> list = new LinkedList<>();
		list.add(from);
		loop: while(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				int[] q = list.poll();
				if(q == to)
					break loop;
				if(visited[q[0]][q[1]] == 1)
					break;
				else
					visited[q[0]][q[1]] = 1;
					
				for(int j = 0; j <= list.size(); j++) {
										
						
				}
				
			}
		}
		
	}
}
