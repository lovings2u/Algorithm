package cycling;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int maxNum = 0, now = -1, preNum = 1001, upCount = 0;
		//maxNum:  �ִ� ���̰�
		//now: ���� ���� ����
		//preNum: ������ ���� ����
		//upCount: ���ӵ� ��� ó���� �� ���� ����
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		for(int i = 0; i < arraySize; i++) {
			now = sc.nextInt();
			upCount = now > preNum? upCount+now-preNum : 0;
			preNum = now;
			maxNum = Math.max(maxNum, upCount);
		}
		System.out.println(maxNum);
	}
}
