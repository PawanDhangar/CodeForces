import java.util.Scanner;

public class Partition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += Math.abs(scan.nextInt());
        }
        System.out.println(result);
    }
}