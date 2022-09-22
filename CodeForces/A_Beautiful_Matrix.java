
import java.io.EOFException;
import java.util.*;

/*
Contributed by
Pawan Dhangar
*/

public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // just look for 1
        // middle intersectipoint is [2][2] if 0-4
        int one_x = -1; // row
        int one_y = -1; // col
        int efforts = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] == 1) {
                    one_x = i;
                    one_y = j;
                    break;
                }
            }
        }

        efforts = Math.abs(2 - one_x) + Math.abs(2 - one_y);
        System.out.println(efforts);

    }
}
