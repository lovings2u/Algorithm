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

		int k = 0; // while�� �ȿ��� 0���� �����ϱ�����
		min = p[0]; // ó���� min���� �ε��� 0�� ������ ����
		while (true) {

			if (p[k] < p[k + 1]) { // ���� ���ε������� ���� �ε����� ũ��
				max = p[k + 1]; // max�� ��� ��ü������
				k++;
			} else { // ���ε������� �۰ų� ������
				temp = max - min; // �ϴ� �ű������ ���̸� ���
				if (height < temp)
					height = temp; // ���� ���Ǿ��ִ� ���̺��� ���� ���̰� ũ�� �ٲ�
				k = k + 1;
				if (k + 1 != p.length)
					min = p[k];
				// ���� �����ε����� ������ ������ �ε����� �ƴϸ� min���� �ٽ� ���簡��Ű�� ������ �ٲ۴�.
			}

			if (k + 1 == p.length) { // �����ε����� ������ �ε����̸�

				temp = max - min;
				if (height < temp) {
					height = temp;
					temp = height;
				}
				k = k + 1;
				break; // ��
			}
		}
		System.out.println(height);

	}

}
