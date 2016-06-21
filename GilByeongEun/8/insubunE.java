import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        int isp = (int)((-1)*a+Math.sqrt((double)(a*a-4*b)))/2;
        int iss = (int)((-1)*a-Math.sqrt((double)(a*a-4*b)))/2;
         
        if(isp+iss == (-1)*a){
            if(isp>iss){
                System.out.println("(x"+isp+")(x"+iss+")");
            }
            else{
                System.out.println("(x"+iss+")(x"+isp+")");
            }
        }
        else{
            System.out.println("impossible");
        }
    }
}
