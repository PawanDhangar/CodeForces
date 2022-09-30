import java.util.Scanner;

public class Ultra_fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        String sc2 = sc.nextLine();
        String[] arr1 = new String[sc1.length()];

        if (sc1.length() == sc2.length()) {
            for (int i = 0; i < sc1.length(); i++) {
                if (sc1.charAt(i) == sc2.charAt(i)) {
                    arr1[i] = "0";
                } else {
                    arr1[i] = "1";
                }
            }
        }
        for (int j = 0; j < sc1.length(); j++)
            System.out.print(arr1[j]);
        sc.close();
    }
}
