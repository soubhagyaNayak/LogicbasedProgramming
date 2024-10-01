import java.util.*;

public class pallindrome {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int d;
        int rev = 0;
        while (temp != 0) {
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.print(n + " is armstrong number");
        } else {
            System.out.println(n + " is not a armstrong number");
        }
    }
}
