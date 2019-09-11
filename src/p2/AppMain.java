package p2;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("1 = ค้อน, 2 = กระดาษ, 3 = กรรไกร");
        Scanner scanner = new Scanner(System.in);

        System.out.print("เลือกหมายเลขสิ่งของสำหรับผูู้เล่น #1: ");
        int player1 = scanner.nextInt();

        System.out.print("เลือกหมายเลขสิ่งของสำหรับผูู้เล่น #2: ");
        int player2 = scanner.nextInt();
        String result = "";

        if(player1 == 1) {                  //ค้อน
            if(player2 == 1) {            //ค้อน
                result = "เสมอกัน";
            } else if(player2 == 2) {     //กระดาษ
                result = "ผู้เล่น 2 ชนะ";
            } else if(player2 == 3) {     //กรรไกร
                result = "ผู้เล่น 1 ชนะ";
            }
        } else if(player1 == 2) {         //กระดาษ
            if(player2 == 1) {                  //ค้อน
                result = "ผู้เล่น 1 ชนะ";
            } else if(player2 == 2) {     //กระดาษ
                result = "เสมอกัน";
            } else if(player2 == 3){      //กรรไกร
                result = "ผู้เล่น 2 ชนะ";
            }
        } else if(player1 == 3) {     //กรรไกร
            if(player2 == 1) {           //ค้อน
                result = "ผู้เล่น 2 ชนะ";
            } else if(player2 == 2) {   //กระดาษ
                result = "ผู้เล่น 1 ชนะ";
            } else if(player2 == 3){      //กรรไกร
                result = "เสมอกัน";
            }
        }
        System.out.println(result);
    }
}
