import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
         
        for(int i=1,k=a/2;i<=k;i++){
            if(a%i==0){
                sum+=i;
            }
             
        }
        if(sum==a){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
