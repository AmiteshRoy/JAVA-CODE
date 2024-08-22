/*public class whileLoop {
    public static void main(String args[]) {
        int counter = 0;
        while (counter<10) {
            System.out.println("hii");
            counter++;
        }
    }
    
}
*/
import java.util.*;
public class whileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <=n) {
            sum +=i;
            i++;
        }
        System.out.println("sum is;"+sum);
    }
} 