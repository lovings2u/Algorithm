import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=0;
        int count=0;
        int acount=0;
        int bcount=0;
        int ccount=0;
        int dcount=0;
        int fcount=0;
         
        while(true){
             
            input = sc.nextInt();
            if(input ==-1)
                break;
            input /= 10;
            switch ( input ) {
               case 10: 
               case 9: acount++;break;
               case 8: bcount++;break;
               case 7: ccount++;break;
               case 6: dcount++;break;
               default: fcount++;
            }
            count++;
        }
        System.out.print(count + "\n" + acount + "\n" + bcount + "\n" + ccount + "\n" + dcount + "\n" + fcount);
        
         
         
    }
}
