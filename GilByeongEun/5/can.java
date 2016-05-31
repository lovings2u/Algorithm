import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long black = sc.nextLong();
        long white = sc.nextLong();
         
        if(white%2==1){
            System.out.println("white");
        }
        else{
            System.out.println("black");
        }
    }
}
