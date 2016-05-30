import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int a = sc.nextInt();
        String result = (a%2 == 0) ? "black" : "white";
        System.out.println(result);
    }
}