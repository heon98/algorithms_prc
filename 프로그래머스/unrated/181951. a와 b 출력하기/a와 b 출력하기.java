import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String one = String.format("a = %d", a);
        String two = String.format("b = %d", b);
        System.out.println(one + "\n" + two);
    }
}