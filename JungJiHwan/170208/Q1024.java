package JungOl;

import java.util.ArrayList;
import java.util.Scanner;

class Pos{
	int x, y;
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Q1024 {
	ArrayList<Pos> pos;
	int front = 0;
	int rear = -1;
	public static void main(String[] args) {new Q1024();}
	public Q1024() {
		Scanner sc = new Scanner(System.in);
		pos = new ArrayList<>();
		int count = 0, a = sc.nextInt(), b = sc.nextInt();
		int mat[][] = new int[a][b];
		
		for(int i = 0; i<a; i++){
			for(int j = 0; j<b; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		push(new Pos(0, 0));
		
		while(true){
			Pos p = pop();
			if(p == null) break;
			if(p.x != a - 1){
				if(mat[p.x + 1][p.y] < mat[p.x][p.y]){
					push(new Pos(p.x + 1, p.y));
					System.out.println("\nmat[p.x + 1][p.y] : "+mat[p.x + 1][p.y]);
					System.out.println("x  : "+(p.x+1) + "//y : "+p.y);
				}
			}
			if(p.y != b - 1){
				if(mat[p.x][p.y + 1] < mat[p.x][p.y]){
					push(new Pos(p.x, p.y + 1));
					System.out.println("\nmat[p.x][p.y + 1] : "+mat[p.x][p.y + 1]);
					System.out.println("x  : "+(p.x)+ "//y : "+(1+p.y));
				}
			}
			if(p.x != 0){
				if(mat[p.x - 1][p.y] < mat[p.x][p.y]){
					push(new Pos(p.x - 1, p.y));
//					System.out.println("\nmat[p.x + 1][p.y] : "+mat[p.x + 1][p.y]);
//					System.out.println("x  : "+(p.x+1) + "//y : "+p.y);
				}
			}
			if(p.y != 0){
				if(mat[p.x][p.y - 1] < mat[p.x][p.y]){
					push(new Pos(p.x, p.y - 1));
//					System.out.println("\nmat[p.y - 1][p.y] : "+mat[p.x + 1][p.y]);
//					System.out.println("x  : "+(p.x+1) + "//y : "+p.y);
				}
			}
			if(p.y == b - 1 && p.x == a - 1){
				count++;
			}
		}
		System.out.println(count);
	}
	
	void push(Pos pos){
		++rear;
		this.pos.add(pos);
	}
	
	Pos pop(){
		if(front>rear) return null;
		return pos.get(front++);
	}
}
