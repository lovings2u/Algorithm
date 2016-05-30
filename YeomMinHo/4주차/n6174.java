import java.util.Scanner;
 
public class n6174 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int num;
        int count=0;
        String min, max;
         
        num = sc.nextInt();
         
        while(num!=6174){
            a[0] = num%10;
            a[1] = (num%100-a[0])/10;
            a[2] = (num%1000-a[0]-10*a[1])/100;
            a[3] = (num-a[0]-10*a[1]-100*a[2])/1000;
         
            for (int i=0 ; i<a.length-1 ; i++) {
                for (int j=0 ; j<a.length-1-i ; j++) {
                    if(a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
         
            min = String.valueOf(a[0]) + String.valueOf(a[1]) + String.valueOf(a[2]) + String.valueOf(a[3]);
            max = String.valueOf(a[3]) + String.valueOf(a[2]) + String.valueOf(a[1]) + String.valueOf(a[0]);
         
            num = Integer.valueOf(max)-Integer.valueOf(min);
         
            count++;
        }
         
        System.out.println(count);
    }
}