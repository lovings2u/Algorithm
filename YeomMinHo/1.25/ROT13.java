import java.util.Scanner;

public class ROT13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int temp = 0;
		String result = "";
		
		input = sc.nextLine();
		
		for(int i=0 ; i<input.length() ; i++) {
			temp = (int)input.charAt(i);
			
			if (temp >= (int)'A' && temp <= (int)'Z') {			// 대문자일 경우
				temp += 13;		// 암호로 영어 알파벳을 13글자씩 밀어서 만듬.
				if(temp > (int)'Z') {	// 대문자 Z를 넘어설 경우
					temp -= 26;
				}
			} else if (temp >= (int)'a' && temp <= (int)'z') {	// 소문자일 경우
				temp += 13;		// 암호로 영어 알파벳을 13글자씩 밀어서 만듬.
				if(temp > (int)'z') {	// 소문자 z를 넘어설 경우
					temp -= 26;
				}
			}
			
			System.out.print((char)temp);
		}
	}
}
