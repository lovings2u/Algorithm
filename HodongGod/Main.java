/* °³Á¶½É
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int first_aggre = sc.nextInt();
		int first_obe = sc.nextInt();
		
		int second_aggre = sc.nextInt();
		int second_obe = sc.nextInt();
		
		int [] person = new int[3];
		String[] result = {"none", "one", "both"};
		
		for(int i = 0; i < 3; i++){
			person[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println(result[isAggre(first_aggre, first_obe, person[i]) + isAggre(second_aggre, second_obe, person[i])]);
		}
		
		
	}
	
	public static int isAggre(int aggre, int obe, int person)
	{
		person = person % (aggre + obe);
		if(person <= aggre && person != 0){
			return 1;
		}else{
			return 0;
		}
		
	}

}
*/
/* ÀÌÀ± ±¸ÇÏ±â
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double costprice = sc.nextDouble();
		double ratio = sc.nextDouble();
		double discount_ratio = sc.nextDouble();
		
		double check_profit = (costprice * (1 + ratio / 100)) * (1 - (discount_ratio / 100)) - costprice;
		System.out.println((check_profit > 0) ? Math.round(check_profit) : "loss");
	}
	
}
 */
/* Äý ¹®Á¦
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long row = sc.nextLong();
		long col = sc.nextLong();
		
		System.out.println((row > col) ? col : row);
	}
	
}

*/


/* È¦¼ö
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int odd_sum = 0;
		int odd_minimum = Integer.MAX_VALUE;
		for(int i = 0; i < 7; i++){
			int temp = sc.nextInt();
			
			if(temp % 2 != 0){
				odd_sum += temp;
				if(temp < odd_minimum){
					odd_minimum = temp;
				}
			}
		}
		
		if(odd_sum != 0){
			System.out.println(odd_sum);
			System.out.println(odd_minimum);
		}else{
			System.out.println(-1);
		}
	}
	
}

*/
/* ½Ã°è
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time == 12){
			System.out.printf("%.6f", 0.000000);
		}else if(time == 11){
			System.out.println("CAN'T SEE!");
		}else{
			System.out.printf("%.6f", 30 * time /5.5);
		}
	}
	
}
*/