import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=0;
        int r[] = new int[10000];
        /* 1더하고 0인지 1인지 0이면 4 1이면 7 
         * 3이면 4, 0 0       4이면 5, 1 0     7이면 8, 0 0 0     6이면 7, 11 
        1   0 ...4  ㅛ
        2   1 ...7 
        3   00 ...44 
        4   01 ...47 
        5   10 ...74 
        6   11 ...77 
        7   000 ... 444 
        8   001 ... 447 
        9   010 ... 474 
        10  011 ... 477 
            100 ... 744 
            101 ... 747 
            110 ... 774 
            111 ... 777*/
        a=a+1;
        while(a/2!=0){
            if(a%2==0){
                i++;
                r[i] = 4;
                 
            }
            else{
                i++;
                r[i] = 7;
            }
            a= a/2;
        }
         
        for(int j=i;j>0;j--){
            System.out.print(r[j]);
        }
    }
}
