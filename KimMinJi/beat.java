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
            else if((s+d)%2!=0){System.out.println("impossible");}
                         
            else{System.out.println(a+" "+b);}
        }
    }}
