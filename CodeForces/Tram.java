import java.util.*;
import java.io.*;

public class Tram {

    public static void main(String[] args) {
        // Grab input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of stops
        int enter, exit, currentCapacity, minCapacity;
        enter = exit = currentCapacity = minCapacity = 0;
        for (int i = 0; i < n; i++) {
            exit = sc.nextInt();
            enter = sc.nextInt();

            currentCapacity -= exit;
            currentCapacity += enter;

            if (currentCapacity > minCapacity) {
                minCapacity = currentCapacity;
            }
        }
        System.out.println(minCapacity);
    }
}
