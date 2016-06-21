import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = 1; i <= a/2; i++) {
            if(b%i == 0 && (b/i)+i==a){
                System.out.println("(x-"+i+")(x-"+b/i+")");
                System.exit(0);
            }
        }
        System.out.println("impossible");
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] arr = new int[2];
        arr[0]=0; arr[1]=0;
        int b2 = (int)Math.sqrt(b);
        if(b+1==a){
            arr[1]=1;
            arr[0]=b;
        }else{
            for (int i = b2; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    if(((i*j)==b && ((i+j)==a))){
                        if(i>=j){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                }
            }
        }
        if(arr[0]==0 && arr[1]==0){
            System.out.println("impossible");
        }else{
            System.out.print("(x-"+arr[1]+")(x-"+arr[0]+")");
        }
    }
}