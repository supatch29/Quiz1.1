package p1;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            String pw1 = "aaa";
            String pw2 = "bbb";
            System.out.print("New Password: ");
            Scanner input = new Scanner(System.in);
            pw1 = input.nextLine();
            while (!pw2.equals(pw1)){
                System.out.print("Conrirm Password:");
                pw2 = input.nextLine();
            }
            System.out.println("\nPassword OK");
        }
    }
