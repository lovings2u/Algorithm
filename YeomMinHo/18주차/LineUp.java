package lineUp;
import java.util.Scanner;

public class LineUp {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		int[] p = new int[num];
		int[] list = new int[num];  // 각 위치에서 최대로 배열되어 있는 개수 저장
		int maxV = 0; // 결과 값 출력하기 위한 max 값 구하기 (list 배열에서)
		
		
		for (int i=0 ; i<num ; i++) {
			p[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; ++i)
		{
			list[i] = 1;
			for (int j = 0; j < i; ++j)
			{
//				System.out.println("list[j] : " + list[j] + " list[i] : " + list[i]);
				if (p[j] < p[i] && list[j] >= list[i])
				{
					list[i] = list[j] + 1;
				}
//				System.out.println("in ~~ " + " i : " + i + " j : " + j + " list : " + list[i]);
			}
			
			if (maxV < list[i])
			{
				maxV = list[i];
			}
		}

		System.out.println(num - maxV);
	}
}

