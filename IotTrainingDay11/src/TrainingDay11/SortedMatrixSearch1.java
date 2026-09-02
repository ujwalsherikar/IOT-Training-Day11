package TrainingDay11;

import java.util.Scanner;
public class SortedMatrixSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        System.out.print("Enter alphabet: ");
        char target = sc.next().charAt(0);
        int i = 0;
        int j = 3;
        while (i < 4 && j >= 0) {
            if (a[i][j] == target) {
                System.out.println("Alphabet " + target + " Found");
                return;
            }
            else if (a[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Alphabet " + target + " Not Found");
    }
}