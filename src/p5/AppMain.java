package p5;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("น้ำหนัก (กิโลกรัม): ");
        double weight = scanner.nextDouble();

        System.out.print("ส่วนสูง (เซ็นติเมตร): ");
        double height = scanner.nextDouble();
        height /= 100;   //cm => m

        double bmi = weight / (height * height);
        System.out.printf("ค่า BMI คือ: %.2f\n", bmi);
        String msg = "ลักษณะรูปร่างคือ: ";

        if(bmi >= 40) {
            msg += "อ้วนขั้นสูงสุด";
        } else if(bmi >= 35) {
            msg += "อ้วนขั้นที่ 2";
        } else if(bmi >= 28.5) {
            msg += "อ้วนขั้นที่ 1";
        } else if(bmi >= 23.5) {
            msg += "น้ำหนักเกิน";
        } else if(bmi >= 18.5) {
            msg += "อยู่ในเกณฑ์ปกติ";
        } else {
            msg += "น้ำหนักต่ำกว่าเกณฑ์";
        }
        System.out.println(msg);

    }
}


