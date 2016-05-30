package chch;

import java.util.Scanner;

public class flea{
 
    public static void main(String[] args) {
        int n1, n2, n3, m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), x1 = sc.nextInt(), y1 =sc.nextInt();
        for (int i = 0; i < s; i++) {
            if(i>=305){
                i=i+1;
            }
            n1 = x + (i*x1);
            m1 = y + (i*y1);
            n2 = n1/s;
            m2 = m1/s;
            n3 = n1%s;
            m3 = m1%s;
             
            if((n2+m2)%2 != 0){
                System.out.println("After " + i + " jumps the flea lands at (" + n1 +", "+ m1 +").");
                break;
            }else if((n3 == 0 && m3 == 0) || (n3==s && m3 ==s) || (n3==0 && m3==s) || (n3==s && m3==0)){
                System.out.println("The flea cannot escape from black squares.");
                break;
            }
        }
    }
}