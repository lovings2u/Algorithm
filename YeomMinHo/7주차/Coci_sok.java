//�迭 �Ⱦ��� ����
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
//        min = minNumber(A/I, B/J, C/K);	// ���� ���� ���� �꽺�� ������ ����.
//         
//        A -= min*I;	// �ּ� ������ ���� �꽺�� ���ϱ�
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


// �迭 ����Ͽ� ���� (�̰� �� ����)
import java.util.Scanner;
 
public class Coci_sok {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] juice = new double[3];
        double[] ratio = new double[3];
        double min=10000;
        int i=0;
        
        for(i=0 ; i<3 ; i++) {
        	juice[i] = sc.nextDouble();	// �꽺�� �� �Է�
        }
        for(i=0 ; i<3 ; i++) {
        	ratio[i] = sc.nextDouble();		// Ĭ���� ���� �� ���� ���� �Է�
        }
         
        for(i=0 ; i<3 ; i++) {
            min = Math.min(min, juice[i]/ratio[i]);	// ���� ���� ���� �꽺�� ������ ����.
        }

        for(i=0 ; i<3 ; i++) {
            juice[i] -= min*ratio[i];	// �ּ� ������ ���� �꽺�� ���ϱ�	
            System.out.println(juice[i] + " ");
        }
    }
}