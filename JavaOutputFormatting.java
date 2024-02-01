import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = inp.next();
            int x = inp.nextInt();
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");

        inp.close();
    }

}
