// 시간초과 에러
//
//import java.util.Scanner;
// 
//public class Ctu_stock {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int D,M;
//        int temp=0;
//        int max=0;
//         
//        D = sc.nextInt();
//        M = sc.nextInt();
//         
//        int[] p = new int[D];
//        for (int i=0 ; i<D ; i++) {
//            p[i] = sc.nextInt();
//        }
//         
//        for (int i=0 ; i<D ; i++) {
//            for (int j=i+1 ; j<D ; j++) {
//                temp = M/p[i]*p[j] - M + M%p[i];
//                if (temp>max) {
//                    max = temp;
//                }
//            }
//        }
//         
//        System.out.println(max);
//    }
//}

import java.util.Scanner;
 
public class Ctu_stock {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int D,M;
        long temp=0;
        long max=0;
         
        D = sc.nextInt();
        M = sc.nextInt();
         
        int[] p = new int[D];
        for (int i=0 ; i<D ; i++) {
            p[i] = sc.nextInt();
        }
         
        for (int i=0 ; i<D ; i++) {
            for (int j=i+1 ; j<D ; j++) {
                temp = M/p[i]*p[j] - M + M%p[i];
                if (temp>max) {
                    max = temp;
                }
            }
        }
         
        System.out.println(max);
    }
}