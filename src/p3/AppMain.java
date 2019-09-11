package p3;
import java.util.Scanner;
public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ปี พ.ศ. ที่เกิด: ");
        int y = scanner.nextInt();
        String gen = "";

        if(y <= 2443) {
            gen = "Lost Generation";
        } else if(y >= 2444 && y <= 2467) {
            gen = "Greatest Generation";
        } else if(y >= 2468 && y <= 2488) {
            gen = "Silent Generation";
        } else if(y >= 2489 && y <= 2507) {
            gen = "Baby Boomer Generation";
        } else if(y >= 2508 && y <= 2519) {
            gen = "Generation X";
        } else if(y >= 2520 && y <= 2538) {
            gen = "Generation Y";
        } else if(y >= 2539) {
            gen = "Generation Z";
        } else {
            gen = "Unknown";
        }

        System.out.printf("ผู้เกิดปีพ.ศ. %d จัดอยู่ในกลุ่ม %s\n", y, gen);
    }
}

