package cycling;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int maxNum = 0, now = -1, preNum = 1001, upCount = 0;
		//maxNum:  최대 차이값
		//now: 현재 받은 숫자
		//preNum: 이전에 받은 숫자
		//upCount: 연속될 경우 처음과 끝 숫자 차이
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
