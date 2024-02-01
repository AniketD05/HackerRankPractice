
/*
Input Format ->

There are three lines of input:
1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String. 

There are three lines of output ->

1. On the first line, print String: followed by the unaltered String read from stdin.
2. On the second line, print Double: followed by the unaltered double read from stdin.
3. On the third line, print Int: followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.

Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/
import java.util.Scanner;

public class StdInOut_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        double b = inp.nextDouble();
        inp.nextLine();
        String c = inp.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);

        inp.close();
    }

}
