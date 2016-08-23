package codeinphone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numString = sc.next();
		
		int code = sc.nextInt();
		int select = sc.nextInt()-1;
		String[] inputArr = numString.split("-");
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i].length() > 4) {
				System.out.println("INPUT ERROR!");
				return;
			}
		}
		String input = "";
		System.out.println(inputArr.length);
		if(inputArr.length <= select) {
			input = "    ";
		} else {
			input = String.format("%4s", inputArr[select]);
		}
		
		String[] temp = input.split("");
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			if(temp[i].equals(" ")) {
				result.append(code % 10);
			} else {
				result.append((Integer.parseInt(temp[i]) + code) % 10);
			}
		}
		System.out.println(result);
	}
}
