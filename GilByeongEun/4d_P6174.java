package algo;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		int suc = 6174;
		int count=0;
		
		while(result!=suc)
		{
		  result = kaprekar(result);
		  count++;
		}
		System.out.println(count);
	}
	public static int kaprekar(int number){
		 int result=0;
		
		 String str = number+"";
			int array[] = new int[4];
			for(int i=0;i<str.length();i++){
				array[i] = Integer.parseInt(str.charAt(i)+"");
			}
			Arrays.sort(array);
			String min = array[0] +"" + array[1] + "" + array[2] + ""+array[3];
			String max = array[3] +"" + array[2] + "" + array[1] + ""+array[0];
			result = Integer.parseInt(max) - Integer.parseInt(min);
			
		
		return result;
	}
}
