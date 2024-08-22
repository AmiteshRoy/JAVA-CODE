import java.util.*;


public class AreaofaCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double area = 3.14 * rad * rad;
        double p = 2 * 3.14 * area;
        System.out.println("area of the circle is " +area);
        System.out.println("perimeter of the circle is " +p );
    }
    
}
