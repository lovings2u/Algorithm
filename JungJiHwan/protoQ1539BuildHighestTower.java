import java.util.*;

class Brick{
	int num, extend, height, weight;
	Brick(int num, int extend, int height, int weight){
		this.num = num;
		this.extend = extend;
		this.height = height;
		this.weight = weight;
	}
}

public class protoQ1539BuildHighestTower {
	static ArrayList<Brick> bricks = new ArrayList<>();
	static ArrayList<Integer> result = new ArrayList<>(), save = new ArrayList<>();
	static boolean used [], breaker = false;
	static int num;
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		used = new boolean[num];
		for(int i = 1; i<=num; i++){
			bricks.add(new Brick(i, sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		//////////////////////////////////////////////////////////////////////////
		for(int i = 0; i<num; i++){//시작
			allclear(i);
			used[i]=true;
			roop(i, 0);
			comparetowerheight();
		}
		//////////////////////////////////////////////////////////////////////////
		
		//결과출력
		System.out.println(result.size());
		for(int i = result.size()-1; i>=0; i--){
			System.out.println(result.get(i)+1);
		}
	}
	static void roop(int bricknum, int count){
		ArrayList<Integer> memory = new ArrayList<>();
		memory.clear();
		breaker = true;
		
		for(int i = 0; i<num; i++){
			if(used[i]==false&&check(bricks.get(save.get(save.size()-1)), bricks.get(i))){
				save.add(i);
				used[i]=true;
				breaker = false;
				memory.add(i);
			}
		}

		if(breaker) {
			comparetowerheight();
			save.remove(save.size()-1);
			return;
		}
		for(int i = 0; i<memory.size(); i++){
			System.out.println("count :" + count + "  memory.get(i) : " + memory.get(i));
			roop(memory.get(i), ++count);
		}
	}
	
	
	static void allclear(int alt){
		save.clear();
		save.add(alt);
		for(int i = 0; i<num; i++){
			used[i] = false;
		}
	}
	
	
	
	
	static void comparetowerheight(){
		int resultheight = 0, saveheight = 0;
		for(int i = 0; i<result.size(); i++){
			resultheight += bricks.get(result.get(i)).height;
		}
		for(int i = 0; i<save.size(); i++){
			saveheight += bricks.get(save.get(i)).height;
		}
		if(resultheight < saveheight){
			result.clear();
			result.addAll(save);
		}
	}
	
	
	
	
	
	static boolean check(Brick under, Brick upper){
		if(upper.extend > under.extend) return false;
		if(upper.weight > under.weight) return false;
		return true;
	}
}
