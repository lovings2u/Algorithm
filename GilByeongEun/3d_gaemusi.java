import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_a = sc.nextInt();
        int a_d = sc.nextInt();
        int b_a = sc.nextInt();
        int b_d = sc.nextInt();
        int visit1 = sc.nextInt();
        int visit2 = sc.nextInt();
        int visit3 = sc.nextInt();
        String result1= resultMusi(a_a, a_d, b_a, b_d, visit1);
        String result2= resultMusi(a_a, a_d, b_a, b_d, visit2);
        String result3= resultMusi(a_a, a_d, b_a, b_d, visit3);
        System.out.println(result1+"\n"+result2 + "\n"+ result3);
        sc.close();
    }
    
    public static String resultMusi(int a_a, int a_d, int b_a, int b_d, int visit){
    	int count=0;
    	String result="";
    	int a1 = visit % (a_a+a_d);
        int b1 = visit % (b_a+b_d);
        if(a1>0 && a1<=a_a){
        	count++;
        }
        if(b1>0 && b1<=b_a){
        	count++;
        }
        switch (count) {
		case 0:
			result = "none";
			break;
		case 1:
			result = "one";
			break;
		case 2:
			result = "both";
			break;
		}
    	return result;
    }
}