import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[][] = new float[2][2];
        float temp, temp1;
        int  count=0;
        a[0][0] = sc.nextFloat();
        a[0][1] = sc.nextFloat();
        a[1][0] = sc.nextFloat();
        a[1][1] = sc.nextFloat();
        temp = (a[0][0]/a[1][0])+ (a[0][1]/a[1][1]);
         
        for(int i=0;i<4;i++){
             
            if(temp<(a[0][0]/a[1][0])+(a[0][1]/a[1][1])){
                count=i;
                temp= (a[0][0]/a[1][0]) + (a[0][1]/a[1][1]);
                 
            }
            temp1 = a[0][0];
            a[0][0]=a[1][0];
            a[1][0]=a[1][1];
            a[1][1]=a[0][1];
            a[0][1]=temp1;
             
        }
        System.out.println(count);
   } 
}
