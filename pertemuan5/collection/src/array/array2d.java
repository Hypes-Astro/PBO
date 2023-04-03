package array;

import java.util.Scanner;

/**
 * array2d
 */
public class array2d {

    public static void main(String[] args) {
        int[][] nums = new int[3][2];
        isiMatrix(nums);
        printMatrix(nums);
    }

    static void isiMatrix(int m[][]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Masukan nilai pada baris " + i + " dan kolom " + j + " : ");
                m[i][j] = in.nextInt();
            }
        }
    }

    static void printMatrix(int m[][]) {
        System.out.println("----------------------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                // print tidak membuat baris baru
            }
            System.out.println(" ");
        }
    }
}