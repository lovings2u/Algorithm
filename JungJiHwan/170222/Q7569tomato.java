package Backjoon1;

import java.util.ArrayList;
import java.util.Scanner;


class Tomato{
	int x, y, z, count;
	public Tomato(int z, int x, int y, int count) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.count = count;
	}
}

public class Q7569tomato {
	ArrayList<Tomato> queue = new ArrayList<>();
	int map[][][];
	int col, row, height, count = 0;
	
	public static void main(String[] args) {new Q7569tomato();}
	public Q7569tomato() {
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		height = sc.nextInt();
		map = new int[height][row][col];
		for(int i = 0; i<height; i++){ 
			for(int j = 0; j<row; j++){
				for(int k = 0; k<col; k++){
					map[i][j][k] = sc.nextInt();
				}
			}
		}sc.close();
		cycle();
	}
	
	private void cycle() {
		for(int i = 0; i<height; i++){
			for(int j = 0; j<row; j++){
				for(int k = 0; k<col; k++){
					if(map[i][j][k] == 1) push(new Tomato(i, j, k, 0));
				}
			}
		}
		
		//cycle
		while(true){
			Tomato tomato = pop();
			if(tomato == null) break;
			int x = tomato.x, y = tomato.y, z = tomato.z;

			if(x!=0 && map[z][x - 1][y]==0){
				map[z][x - 1][y] = 1;
				push(new Tomato(z, x - 1, y, tomato.count + 1));
			}
			if(x!=row-1 && map[z][x + 1][y]==0){
				map[z][x + 1][y] = 1;
				push(new Tomato(z, x + 1, y, tomato.count + 1));
			}
			
			if(y!=0 && map[z][x][y - 1]==0){
				map[z][x][y - 1] = 1;
				push(new Tomato(z, x, y - 1, tomato.count + 1));
			}
			if(y!=col-1 && map[z][x][y + 1]==0){
				map[z][x][y + 1] = 1;
				push(new Tomato(z, x, y + 1, tomato.count + 1));
			}

			if(z!=0 && map[z - 1][x][y]==0){
				map[z - 1][x][y] = 1;
				push(new Tomato(z - 1, x, y, tomato.count + 1));
			}
			if(z!=height-1 && map[z + 1][x][y]==0){
				map[z + 1][x][y] = 1;
				push(new Tomato(z + 1, x, y, tomato.count + 1));
			}
			count = count > tomato.count ? count : tomato.count;
		}

		if(endCheck()) System.out.println(count);
		else System.out.println(-1);
	}
	
	private boolean endCheck() {
		for(int i = 0; i<height; i++){
			for(int j = 0; j<row; j++){
				for(int k = 0; k<col; k++){
					if(map[i][j][k] == 0) return false;
				}
			}
		}
		return true;
	}
	
	int front = 0, rear = -1;
	private void push(Tomato tomato) {
		queue.add(tomato);
		rear++;
	}
	private Tomato pop() {
		if(front > rear) return null;
		return queue.get(front++);
	}
}
