import java.util.Scanner;

public class rot13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String pw="";
		int a=0;
		for(int i=0;i<s.length();i++){
			a=s.charAt(i);
			if(a>=65&&a<=77){
				pw=pw+Character.toString((char)(a+13));
			}else if(a>=78&&a<=90){
				pw=pw+Character.toString((char)(a-13));
			}else if(a>=97&&a<=109){
				pw=pw+Character.toString((char)(a+13));
			}else if(a>=110&&a<=122){
				pw=pw+Character.toString((char)(a-13));
			}else {
				pw=pw+Character.toString((char)(a));;
			}
				
		}
		System.out.println(pw);
	}

}
