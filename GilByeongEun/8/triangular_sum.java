import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
        for(int i=1; i<=n;i++){
             
            result+= i*t(i+1);
        }
         
        System.out.println(result);
    }
     
    public static int t(int a){
        int result=0;
        for(int i=1; i<=a;i++){
            result +=i;
        }
         
         
        return result;
    }
}
