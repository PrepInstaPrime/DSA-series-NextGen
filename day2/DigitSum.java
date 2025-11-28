import java.util.Scanner;
public class DigitSum {
    static int digitSum(int num){ // num= 38
        int sum=0; 
        while(num!=0){ // step 1: num=38 , step 2: num=3
            int lastDigit=num%10; // ld= 38%10=8 // ld= 3%10=3
            sum=sum+lastDigit; // sum=0+8 // sum=8+3 =11
            num=num/10; // num=3 // 3/10=0
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(digitSum(num));
    }
}
