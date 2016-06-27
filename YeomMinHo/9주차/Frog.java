import java.util.Scanner;
import java.io.FileInputStream;

public class Frog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNum;	// �׽�Ʈ ����� ���� �Է�
		testNum = sc.nextInt();	
		int[] result = new int[testNum];
		
		int stoneNum;	// ��ǥ 0 �� ���� ���� ������ ������ ������ ���� ����
		int[] stoneGps;	// ������ ��ǥ�Է� �迭 ����
		int maxJump;	// ���� �ִ� �̵��Ÿ� ����
		
		for (int i=0 ; i<testNum ; i++) {
			stoneNum = sc.nextInt();	// ��ǥ 0 �� ���� ���� ������ ������ ������ ���� �Է�
			
			stoneGps = new int[stoneNum];		// ������ ��ǥ�Է� �迭 �Է�
			for (int j=0 ; j<stoneNum ; j++) {
				stoneGps[j] = sc.nextInt();
			}
			
			maxJump = sc.nextInt();		// ���� �ִ� �̵��Ÿ� �Է�
			
			result[i] = Cal(stoneNum, stoneGps, maxJump);
		}
		
		for (int i=0 ; i<testNum ; i++) {
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]);
		}
	}
	
	public static int Cal(int stoneNum, int[] stoneGps, int maxJump) {
		int location = 0;
		int count = 0;
		
		for (int i=0 ; i<stoneNum ; i++) {
			if (stoneGps[i]-location > maxJump) {		// �ִ�� �����Ͽ� ��ġ(location) �ű�� count �� ����
				location = stoneGps[i-1];
				count++;
			}
			
			if (i>0) {		// ���� ������ maxJump���� ũ�� �ݺ��� ����
				if (stoneGps[i] - stoneGps[i-1] > maxJump) {	
					count = -1;
					break;
				}	
			}
		}

		if (stoneGps[stoneNum-1]-location <= maxJump) {		// ���������� �Էµ� location���� �迭�� ������ ���� ���Ͽ� count �ϳ� �߰� 
			count++;
		}

		return count;
	}
}
