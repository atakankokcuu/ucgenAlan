import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        System.out.println("üçgen alan hesaplama programı ");
        Scanner scanner=new Scanner(System.in);
        System.out.print("üçgena a kenar değerini girin ");
        int a =scanner.nextInt();
        System.out.print("üçgena b kenar değerini girin ");
        int b =scanner.nextInt();
        System.out.print("üçgena c kenar değerini girin ");
        int c =scanner.nextInt();
double d =(a+b+c)/2.0;

double e =d*(d-a)*(d-b)*(d-c);

        System.out.print("üçgenin alanı =  "+e);
    }
}
