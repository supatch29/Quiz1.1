package p7;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.Random;
import javax.swing.UIManager;

public class AppMain {
    public static void main(String[] args) {
        Font font = new Font("Tahoma", Font.PLAIN, 14);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("TextField.font", font);
        boolean win = false;
        Random random = new Random();
        int number = random.nextInt(100);
        int count = 1;
        final int MAX_GUESS = 7;
        int guessNum;
        String message = "";

        do {
            String input = JOptionPane.showInputDialog("การทายครั้งที่: " + count + "\nกรุณาใส่ตัวเลข:");
            guessNum = Integer.parseInt(input);
            if(guessNum > number) {
                message= "น้อยกว่านี้";
            } else if(guessNum < number) {
                message = "มากกว่านี้";
            } else if(guessNum == number) {
                message = "ถูกต้อง";
                win = true;
            }
            JOptionPane.showMessageDialog(null, message);

            if(count == MAX_GUESS) {
                JOptionPane.showMessageDialog(null, "คุณทายเกินจำนวนครั้งที่กำหนดแล้ว");
                break;
            }
            count++;
        } while(!win);
    }
}
