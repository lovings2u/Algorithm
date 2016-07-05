package chemistry;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Double> input = new LinkedList<Double>();
		do {
			input.add(sc.nextDouble());
		} while(input.getLast() != 999);
		
		Iterator<Double> iter = input.iterator();
		double flag = 0, prev = 0;
		while(iter.hasNext()) {
			if(flag == 0) {
				prev = iter.next();
				flag ++;
				continue;
			}
			double now = iter.next();
			if(now == 999) {
				System.out.println("End of Output");
				break;
			}
			System.out.printf("%.2f\n",now - prev);
			prev = now;
		}
	}
}
