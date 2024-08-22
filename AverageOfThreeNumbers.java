import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first number: ");
        int A = sc.nextInt();
        System.out.println("Enter the second number: ");
        int B = sc.nextInt();
        System.out.println("Enter the third number: ");
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("average is : " +average);
    }
    
}
