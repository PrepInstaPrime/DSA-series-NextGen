import java.util.Scanner;
public class CheckEven {
    static boolean even(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(even(num));
    }
}