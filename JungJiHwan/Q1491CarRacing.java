import java.awt.geom.Area;
import java.util.*;

class Position{
	ArrayList<Integer> his = new ArrayList<>();
	int num;
	Position(int num, ArrayList<Integer> his){
		this.num = num;
		this.his = his;
	}
}

public class Q1491CarRacing {
	static ArrayList<Position> pos = new ArrayList<>();
	static int info[], rich, mount, front = 0, rear = -1;
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		rich = sc.nextInt();
		mount = sc.nextInt();
		info = new int[2*(mount+1)];//짝수번은 거리 홀수번은 정비시간
		for(int i = 0; i<info.length; i++){
			if(i%2==1) continue;
			else info[i] = sc.nextInt();
		}
		for(int i = 0; i<info.length-2; i++){
			if(i%2==0) continue;
			else info[i] = sc.nextInt();
		}
		info[info.length-1] = 0;
		push(new Position(-1, new ArrayList<Integer>()));
		algorithm();
	}
	
	static void algorithm(){
		while(true){
			Position p = pop();
			if(p==null) break;
			if(p.num==info.length-1) continue;//목표지점에 도착했다면면 컨티뉴
			
//			System.out.print("p.num : "+p.num+"//");
			int num = p.num+2;
			int dis = 0;
			if(num>=info.length-1) continue;
			while(true){
				ArrayList<Integer> his = new ArrayList<>();
				his = p.his;

				if(num>=info.length) break;
				dis += info[num-1];
				if(dis<=rich){
					System.out.println("push : "+num);
					for(int j = 0; j<p.his.size(); j++){
						System.out.print(p.his.get(j)+" ");
					}
					his.add(num);
					push(new Position(num,his));
				}
				else break;
				num+=2;
			}
		}
		for(int i = 0; i<pos.size(); i++){
			Position p = pos.get(i);
			if(p.num==11){
				ArrayList<Integer> his = p.his;
				System.out.print(i+" : ");
				for(int j = 0; j<his.size(); j++){
					System.out.print(his.get(j)+" ");
				}
				System.out.println("");
			}
		}
	}
	
	static void push(Position position){
		pos.add(position);
		rear++;
	}
	static Position pop(){
		if(front > rear) return null;
		
		System.out.println("front"+ front);
		return pos.get(front++);
	}
}
