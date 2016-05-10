import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger[] = { 461, 431, 420, 0 };
        int drink[] = { 130, 160, 118, 0 };
        int side[] = {100, 57, 70, 0};
        int desert [] = {167, 266, 75, 0};
        int bi = sc.nextInt();
        int di = sc.nextInt();
        int si = sc.nextInt();
        int dei = sc.nextInt();
        System.out.println("Your total Calorie count is " +(burger[bi-1] + drink[di-1] + side[si-1] + desert[dei-1])+".");
    }
}
