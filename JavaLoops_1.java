import java.util.Scanner;

public class JavaLoops_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }

        inp.close();
    }
}