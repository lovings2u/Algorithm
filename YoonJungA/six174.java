package study4;

import java.util.Scanner;

public class six174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int snum[] = new int[4];
		int count = 0;
		int k1 = 0;
		int k2 = 0;

		while (num != 6174) { // �ݺ�

			count++;

			snum[0] = num / 1000; // 1000���ڸ���
			snum[1] = (num - (snum[0] * 1000)) / 100; // 100�� �ڸ���
			snum[2] = (num - ((snum[0] * 1000) + (snum[1] * 100))) / 10; // 10���ڸ���
			snum[3] = num % 10; // 1���ڸ���

			int temp;
			for (int i = 0; i < snum.length; i++) {
				for (int j = 0; j < snum.length; j++) {
					temp = snum[i];
					if (snum[i] >= snum[j]) { // ū������ ����
						snum[i] = snum[j];
						snum[j] = temp;
					}
				}
			}

			k1 = Integer.parseInt(Integer.toString(snum[0]) + snum[1] + snum[2] + snum[3]); // ū
			k2 = Integer.parseInt(Integer.toString(snum[3]) + snum[2] + snum[1] + snum[0]); // ����

			num = k1 - k2; // ��

		}
		System.out.println(count);
	}

}
