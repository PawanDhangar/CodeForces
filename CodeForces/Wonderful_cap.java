import java.util.Scanner;

public class Wonderful_cap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);
    }
}
