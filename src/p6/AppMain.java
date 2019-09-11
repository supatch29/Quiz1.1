package p6;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("รูปแบบรหัสใต้ฝา: *000*XXXXXXXXXX#");
        System.out.print("กรุณาใส่รหัสใต้ฝา: ");
        String code = scanner.next();

        String msg = "ข้อมูลของท่านถูกดำเนินการแล้ว";
        int length = code.length();
        if(length != 16) {
            msg = "กรุณาใส่รหัสให้ตรงตามรูปแบบ";
        } else {
            char ch;
            for(int i = 0; i < length; i++) {
                //*000*XXXXXXXXXX#
                //อย่าลืมว่าในลำดับอักขระในสตริงนั้นจะเริ่มจาก 0
                //แต่ลำดับตามความเข้าใจของคนทั่วไปนั้นจะเริ่มจาก 1
                ch = code.charAt(i);
                if((i == 0 || i == 4) && (ch != '*')) {
                    msg = "ตำแหน่งที่ 1 และ 5 ต้องเป็น * เท่านั้น";
                    break;
                } else if((i >= 1 && i <= 3) && (ch != '0')) {
                    msg = "ตำแหน่งที่ 2-4 ต้องเป็น 0 เท่านั้น";
                    break;
                } else if((i >= 5 && i <= 14) && !Character.isDigit(ch)) {
                    msg = "ตำแหน่งที่ 6-12 ต้องเป็นเลข 0-9 เท่านั้น";
                    break;
                } else if(i == 15 && ch != '#') {
                    msg = "ต้องปิดท้ายด้วยเครื่องหมาย #";
                    break;
                }
            }
        }
        System.out.println(msg);
    }
}
