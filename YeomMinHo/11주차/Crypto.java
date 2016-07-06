package crypto;
import java.util.Scanner;

public class Crypto {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		String cKey;
		String cText="";
		int uni;
		
		text = sc.nextLine();
		cKey = sc.nextLine();
		
		if (cKey.length() < text.length()) {			//평문의 입력 길이만큼의 cKey 구하기
			for(int i=0 ; i<text.length() ; i++) {
				cKey += cKey.charAt(i%cKey.length()); 
			
				if (cKey.length() == text.length()) {
					break;
				}
			}
		} else {
			cKey = cKey.substring(0, text.length());
		}
				
		for(int i=0 ; i<text.length() ; i++) {
			if (text.charAt(i) != ' ') {
				uni = (char)text.charAt(i) - (char)cKey.charAt(i);
				if (uni > 0) {
					System.out.print((char)(96 + uni));		// 유니코드 97이 a
				} else {
					System.out.print((char)(122 + uni));	// 유니코드 122는 z uni값이 음수가 되면 z로 돌아가 반복
				}
			} else {
				System.out.print(" ");
			}
			
		}
	}
}
