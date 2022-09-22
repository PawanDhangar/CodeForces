import java.util.Scanner;

public class Sb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String word = sc.nextLine();
        sb.append(word.charAt(0)).append(word.charAt(1));
        System.out.println(sb.toString());
    }
}
