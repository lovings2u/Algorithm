import java.util.Scanner;

public class Tpz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int terran, protoss, zerg;
		int min=100, max=0;
		
		num = sc.nextInt();
		terran = sc.nextInt();
		protoss = sc.nextInt();
		zerg = sc.nextInt();
		
		min = Math.min(terran, protoss);
		min = Math.min(min, zerg);		// 최대 인원은 입력받은 3개의 종족 선호도 최소값과 같다
		
		max = num-(num-terran)-(num-protoss)-(num-zerg);
		
		if (max > 0) {
			System.out.println(min + " " + max);
		} else {
			max = 0;
			System.out.println(min + " " + max);
		}
	}
}
