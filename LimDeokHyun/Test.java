import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int p = sc.nextInt();
		int m = sc.nextInt();
		String[] temp = input.split("-");
		
		
		String str ;
		String s = input.substring(input.length()-1);
		if(s.equals("-")&& temp.length==m-1){
			str = "0000";
		}else{
			str =  temp[m-1];
		}
		int length = str.length();
		
		
		
		for(int i =0; i<temp.length;i++){
			if(temp[i].length()>=5){
				System.out.println("INPUT ERROR!");
				return;
			}
		}
		
		if(length<4){
			for(int i =0; i<4-length;i++){
				str = "0"+str;
			}
		}
		
		int number = Integer.valueOf(str);
		String result = "";
		for(int i =3; i>=0 ;i--){
			
			int num = number/(int)Math.pow(10, i);
			
			
			num = (num+p)%10;
			result = result+num;
		}
		
		
		
		System.out.println(result);
		
	}
}
