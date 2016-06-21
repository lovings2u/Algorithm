import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();
        int a,b;
         
        if(s<d){
            System.out.println("impossible");
        }else{
            a=(s+d)/2;
            b=(s-d)/2;
	    if(a==0&&b==0){System.out.println(a+" "+b);}
            else if((s+d)%2!=0){System.out.println("impossible");}//s는 a+b인거고 d는 a-b이기때문에 s+d는 2a이라서 짝수.따라서 홀수면 impossible
                         
            else{System.out.println(a+" "+b);}
        }
    }}
