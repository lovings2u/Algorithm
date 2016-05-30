package exam20160510;

import java.util.Scanner;

public class vauvau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up1 = sc.nextInt(), down1 = sc.nextInt(), up2 = sc.nextInt(), down2 = sc.nextInt();
        int[] man = new int[3];
        for (int i = 0; i < man.length; i++) {
            man[i] = sc.nextInt();
        }
        for (int i = 0; i < man.length; i++) {
            if(vaowau(up1, down1, man[i]) == true && vaowau(up2, down2, man[i]) == true){
                System.out.println("both");
            }else if(vaowau(up1, down1, man[i]) == true && vaowau(up2, down2, man[i]) == false){
                System.out.println("one");
            }else if(vaowau(up1, down1, man[i]) == false && vaowau(up2, down2, man[i]) == true){
                System.out.println("one");
            }else if(vaowau(up1, down1, man[i]) == false && vaowau(up2, down2, man[i]) == false){
                System.out.println("none");
            }
        }
    }
    public static boolean vaowau(int a, int b, int c){
        int q = a, w = a + b;
        boolean[] arr = new boolean[2000];
        arr[0] = false;
        while(w < 2000){
             
            for (int i = q-a+1; i <= q; i++) {
                arr[i] = true;
            }
            for (int i = q+1; i <= w; i++){
                arr[i] = false;
            }
            q = w + a;
            w = q + b;
        }
        return arr[c];
    }
     
}