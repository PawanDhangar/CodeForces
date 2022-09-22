import java.util.Scanner;

public class BrotherandBear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int i = 0;
        for (i = 0; a <= b; i++) {
            a = a * 3;
            b = b * 2;

        }

        System.out.println(i);
    }
}