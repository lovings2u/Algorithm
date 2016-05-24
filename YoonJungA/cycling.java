package study4;

import java.util.Scanner;

public class cycling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];
		int min = 0;
		int max = 0;
		int height = 0;
		int temp = 0;

		for (int i = 0; i < p.length; i++)
			p[i] = sc.nextInt();

		int k = 0; // while문 안에서 0부터 시작하기위해
		min = p[0]; // 처음에 min값을 인덱스 0번 값으로 지정
		while (true) {

			if (p[k] < p[k + 1]) { // 만약 전인덱스보다 다음 인덱스가 크면
				max = p[k + 1]; // max를 계속 교체시켜줌
				k++;
			} else { // 전인덱스보다 작거나 같으면
				temp = max - min; // 일단 거기까지의 높이를 계산
				if (height < temp)
					height = temp; // 전에 계산되어있는 높이보다 현재 높이가 크면 바꿈
				k = k + 1;
				if (k + 1 != p.length)
					min = p[k];
				// 만약 다음인덱스가 마지막 마지막 인덱스가 아니면 min값을 다시 현재가리키는 것으로 바꾼다.
			}

			if (k + 1 == p.length) { // 다음인덱스가 마지막 인덱스이면

				temp = max - min;
				if (height < temp) {
					height = temp;
					temp = height;
				}
				k = k + 1;
				break; // 끝
			}
		}
		System.out.println(height);

	}

}
