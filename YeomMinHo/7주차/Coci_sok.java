//배열 안쓰고 구현
//
//import java.util.Scanner;
// 
//public class Coci_sok {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double A,B,C,I,J,K;
//        double min;
//         
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//         
//        I = sc.nextInt();
//        J = sc.nextInt();
//        K = sc.nextInt();
//         
//        min = minNumber(A/I, B/J, C/K);	// 가장 적게 남을 쥬스의 비율을 구함.
//         
//        A -= min*I;	// 최소 비율로 남은 쥬스양 구하기
//        B -= min*J;
//        C -= min*K;
//         
//        System.out.print(A + " " + B + " " + C);
//    }
//    
//    public static double minNumber(double x, double y, double z) {
//        double min;
//        min = Math.min(x,y);
//        min = Math.min(min,z);
//        return min;
//    }
//}


// 배열 사용하여 구현 (이게 더 빠름)
import java.util.Scanner;
 
public class Coci_sok {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] juice = new double[3];
        double[] ratio = new double[3];
        double min=10000;
        int i=0;
        
        for(i=0 ; i<3 ; i++) {
        	juice[i] = sc.nextDouble();	// 쥬스의 양 입력
        }
        for(i=0 ; i<3 ; i++) {
        	ratio[i] = sc.nextDouble();		// 칵테일 만들 때 섞는 비율 입력
        }
         
        for(i=0 ; i<3 ; i++) {
            min = Math.min(min, juice[i]/ratio[i]);	// 가장 적게 남을 쥬스의 비율을 구함.
        }

        for(i=0 ; i<3 ; i++) {
            juice[i] -= min*ratio[i];	// 최소 비율로 남은 쥬스양 구하기	
            System.out.println(juice[i] + " ");
        }
    }
}