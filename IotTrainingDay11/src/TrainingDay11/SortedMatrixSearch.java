package TrainingDay11;

import java.util.Scanner;
public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {50, 55, 60, 70}
        };
        System.out.print("Enter no: ");
        int target = sc.nextInt();
        int i = 0;
        int j = a[0].length - 1;
        while (i < a.length && j >= 0) {
            if (a[i][j] == target) {
                System.out.println("Number " + target + " Found");
                return;
            }
            else if (a[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Number " + target + " Not Found");
    }
}