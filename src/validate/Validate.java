package validate;

import java.util.Scanner;
import java.util.TreeMap;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static int number() {
        int number;
        do {
            try {
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("yêu Cầu Bạn Nhập Đúng");
            }
        } while (true);
        return number;
    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Yêu Cầu Bạn Nhap Đúng");
            }
        } while (true);
        return choice;
    }




}
