package KwonSoonGu;

import java.util.Scanner;

/**
 * Created by Soongu on 2017-01-20.
 */
public class Q10824 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] nums = new String[4];
//
//        for (int i=0;i<4;i++) {
//            nums[i] = sc.next();
//        }
//
//        String tmp1, tmp2;
//        tmp1 = nums[0] + nums[1];
//        tmp2 = nums[2] + nums[3];
//
//        long sum = Long.valueOf(tmp1) + Long.valueOf(tmp2);
//        System.out.println(sum);

        long[] num = new long[4];
        Scanner input = new Scanner(System.in);

        for (int i=0;i<4;i++) {
            num[i] = input.nextLong();
        }

        String tmp1, tmp2;
        tmp1 = String.valueOf(num[0]) + String.valueOf(num[1]);
        tmp2 = String.valueOf(num[2]) + String.valueOf(num[3]);

        long result = Long.valueOf(tmp1) + Long.valueOf(tmp2);
        System.out.println(result);
    }
}
