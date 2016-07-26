import java.util.ArrayList;
import java.util.Scanner;
public class Reseto {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt();
		int k = kbd.nextInt();
		
		int count = 0;
		
		int result = 0;
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		int num = 2;
		for(int i=0; i<n-1; i++)
			arr.add(num++);
		
		while(count<k){
			int a = arr.get(0);
				for(int i=0; i<arr.size(); i++){
					if(count>=k)
						break;
					if(arr.get(i)%a == 0){
						result = arr.get(i);
						arr.remove(i);
						count++;
					}
				}
			}
		System.out.println(result);
	}
}
