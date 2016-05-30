package exam20160510;

import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        float d = (float)(a*b*0.01);
        int e = Math.round((a+d)-(float)((a+d)*(c*0.01)));
        if(a>e){
            System.out.println("loss");
        }else{
            System.out.println(e-a);
        }
    }
}