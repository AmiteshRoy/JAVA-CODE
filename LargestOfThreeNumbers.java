import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int a = sc.nextInt();
        System.out.println("Enter 2nd value");
        int b = sc.nextInt();
        System.out.println("Enter 3rd value");
        int c = sc.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("!st value is Largest");
        }else if(b >= c) {
            System.out.println("2nd value is Largest");
        }else{
            System.out.println("3rd value is Largest");
        }
    }
    
}
