package reseto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); //��ü ���ڿ�
		LinkedList<Integer> deleteQueue = new LinkedList<>(); //���� ��⿭
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 2; i <= n; i++) { //��ü ���ڿ� �Է�
			list.add(i);
		}
		
		int count = 0; //���� Ƚ��
		int remove = 0; //������ ������ ����
		while(count != k) {
			remove = list.removeFirst(); //ù��° ���� ����
			count++;
			if(count == k) //�ݺ��� Ż�� ����(count�� ���÷� ����)
				break;
			Iterator<Integer> iter = list.iterator(); //���� ���ڿ� �ݺ���
			while(iter.hasNext()) {
				int temp = iter.next();
				if(temp%remove == 0) { //ù��° ���ڷ� ������ �������� �� ����
					deleteQueue.add(temp); //���� ��⿭�� �߰�
					count++;
					if(count == k) { //�ݺ��� Ż�� ����
						System.out.println(temp); //�������� ���� ��⿭�� �� ���� ��� �� ���θ޼ҵ� ����
						return;
					}
				}
			}
			iter = deleteQueue.iterator(); //���� ��⿭�� �ִ� ���ڵ� ��ü ����
			while(iter.hasNext()) {
				list.remove(list.indexOf(iter.next()));
			}
			deleteQueue.clear(); //���� ��⿭ �ʱ�ȭ
			
		}
		System.out.println(remove);

	}
	
}
