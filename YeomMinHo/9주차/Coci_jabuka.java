import java.util.Scanner;
 
public class Coci_jabuka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rA, gA;
         
        rA = sc.nextInt();
        gA = sc.nextInt();
         
        for (int i=1 ; i<=Math.min(rA,gA) ; i++) {
            if(rA%i==0 && gA%i==0) {
                System.out.println(i + " " + rA/i + " " + gA/i);
            }
        }
    }
}