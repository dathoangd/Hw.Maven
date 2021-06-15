import FisrtTest.TestEx1;
import FisrtTest.TestEx2;
import FisrtTest.TestEx3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ex1
        String input = "You Only Live Once. But if You do it right. once is Enough";
        int countText = TestEx1.countUpperCase(input);
        //count số chữ viết hoa
        System.out.println("----------------------------");
        System.out.println("Số lượng chữ hoa trong chuỗi là: " + countText);
        //in hoa chữ cái đầu tiên:
        System.out.println("----------------------------");
        TestEx1.upperCase(input);


        //Ex2
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nNhập password: ");
        password = sc.nextLine();
        TestEx2.inputPassword(password);

        //Ex3
        TestEx3.dayOfMonth();

    }
}
