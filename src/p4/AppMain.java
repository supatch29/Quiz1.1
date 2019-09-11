package p4;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("จำนวนที่  1: ");
        double a = scanner.nextDouble();

        System.out.print("+, -, *, /, %: ");
        char c = scanner.next().charAt(0);

        System.out.print("จำนวนที่  2: ");
        double b = scanner.nextDouble();

        double r = 0;
        switch(c) {
            case '+':   r = a + b; break;
            case '-':   r = a - b; break;
            case '*':   r = a * b; break;
            case '/':   r = a / b; break;
            case '%':  r = a % b; break;
            default:    r = 0;
        }

        String str = "เท่ากับ:   ";
        if(r % 1 == 0) {
            str += (int)r;
        } else {
            str += r;
        }
        System.out.println(str);
    }
}
