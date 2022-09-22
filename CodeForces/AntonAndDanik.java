import java.util.Scanner;

/*
Contributed by
Pawan Dhangar
*/

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        int a = 0, d = 0;
        for (char x : input.toCharArray()) {
            if (x == 'D')
                d++;
            else
                a++;
        }
        if (a > d)
            System.out.println("Anton");
        else if (d > a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
