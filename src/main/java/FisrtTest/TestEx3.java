package FisrtTest;

import java.util.Scanner;

public class TestEx3 {

    public static double testMonth(){
        double input =0;
        Scanner sc = new Scanner(System.in);

        while (input <= 0){
            try{
                System.out.println("Nhập số để kiểm tra: ");
                input = sc.nextDouble();
            }catch(Exception e){
                System.out.println("Số kiểm tra phải lớn hơn 0");
                System.exit(0);
            }

        }
        return input;
    }
    public static void dayOfMonth(){
        double month = testMonth();
        switch ((int) month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %.0f có 31 ngày", month);
                break;
            case 2:
                System.out.printf("Tháng %.0f có 28 hoặc 29 ngày", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %.0f có 30 ngày", month);
                break;
            default:
                System.out.printf("Số %.0f không phải tháng trong năm", month);
        }
    }

}
