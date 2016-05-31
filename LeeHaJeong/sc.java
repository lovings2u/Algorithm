import java.util.Scanner;
public class sc {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int arr[] = new int[101];
		int grade[] = new int[5];
		int index = 0;
		int index2 = 0;
		while((arr[index++]=kbd.nextInt()) != -1);
		while(index2<index){
			if(arr[index2] == -1)
				break;
			switch(arr[index2++]/10){
			case 10:
			case 9:
				grade[0]++; break;
			case 8:
				grade[1]++; break;
			case 7:
				grade[2]++; break;
			case 6:
				grade[3]++; break;
			default:
				grade[4]++; break;
			}
		}
		System.out.println(index-1);
		for(int i=0; i<index; i++)
			System.out.println(grade[i]);
	}
}
