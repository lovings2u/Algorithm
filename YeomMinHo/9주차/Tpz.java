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
		min = Math.min(min, zerg);		// �ִ� �ο��� �Է¹��� 3���� ���� ��ȣ�� �ּҰ��� ����
		
		max = num-(num-terran)-(num-protoss)-(num-zerg);
		
		if (max > 0) {
			System.out.println(min + " " + max);
		} else {
			max = 0;
			System.out.println(min + " " + max);
		}
	}
}
