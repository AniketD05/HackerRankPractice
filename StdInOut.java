import java.util.Scanner;

public class StdInOut {

    public static void displayArray(int[] arr, int size) {
        System.out.println("\nEntered Numbers Are: ");
        for (int i = 1; i <= size; i++) {
            System.out.println("Number " + i + " is " + arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] arr = new int[50];

        System.out.println("\nHow Many Numbers You Wish To Enter: ");
        int totalNum = inp.nextInt();

        System.out.println("\nEnter Numbers One by One: ");

        for (int i = 1; i <= totalNum; i++) {
            arr[i] = inp.nextInt();
        }

        displayArray(arr, totalNum);

        inp.close();

    }
}
