//이클립스에서 돌리면 답은맞는데 백준에서 돌리면 런타임에러요ㅠ_ㅠ
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> alp = new ArrayList<String>();
		alp.add(0, " ");//공백은 0
		alp.add(1, "a");alp.add(2, "b");
		alp.add(3, "c");alp.add(4, "d");
		alp.add(5, "e");alp.add(6, "a");
		alp.add(7, "g");alp.add(8, "h");
		alp.add(9, "i");alp.add(10, "j");
		alp.add(11, "k");alp.add(12, "l");
		alp.add(13, "m");alp.add(14, "n");
		alp.add(15, "o");alp.add(16, "p");
		alp.add(17, "q");alp.add(18, "r");
		alp.add(19, "s");alp.add(20, "t");
		alp.add(21, "u");alp.add(22, "v");
		alp.add(23, "w");alp.add(24, "x");
		alp.add(25, "y");alp.add(26, "z");//alp arraylist에 인덱스와 알파벳 입력
		String sentence=sc.nextLine();//평서문 입력받음
		String password=sc.nextLine();//암호화키 입력받음
		String[] s=sentence.split("");//평서문 분할
		String[] p=password.split("");//암호화키 분할
		int [] pp=new int[p.length];//암호화키길이만큼 정수형배열생성
		int [] ss=new int[s.length];//평서문 길이만큼 정수형배열생성
		int [] result= new int[s.length];//결과 출력할 배열,평서문길이만큼 초기화
		
		for(int i=0;i<pp.length;i++){
			pp[i]=alp.indexOf(p[i]);}//암호화키 문자를 숫자로 변경			
		
		for(int i=0;i<ss.length;i++){
			ss[i]=alp.indexOf(s[i]);}//평서문 문자를 숫자로 변경			
		int n=0;
		for(int i=0;i<ss.length;i++){
			for(int j=0;j<pp.length;j++){
				result[n*pp.length+j]=ss[n*pp.length+j]-pp[j];//암호문만들기
				if(result[n*pp.length+j]==-1*pp[j]){
					result[n*pp.length+j]=0;//공백이면 공백으로 출력
				}				
				else if(result[n*pp.length+j]<=0){
					result[n*pp.length+j]+=26;//차이가 0보다 작아지면 +26
				}									
			}
			i=(n+1)*pp.length+1;n++;}
		
		for(int i=0;i<result.length;i++){
			System.out.print(alp.get(result[i]));//인덱스를 다시 문자열로 출력
		}	
	
	}
	}


