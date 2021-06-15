package FisrtTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEx2 {
    public static void inputPassword(String password) {
        Pattern p = Pattern.compile("[A-Z]+", Pattern.CASE_INSENSITIVE);
        Pattern p1 = Pattern.compile("[0-9]+", Pattern.CASE_INSENSITIVE);
        Pattern p2 = Pattern.compile("[^a-z0-9A-Z]+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        Matcher m2 = p1.matcher(password);
        Matcher m3 = p2.matcher(password);
        boolean b1 = m.find();
        boolean b2 = m2.find();
        boolean b3 = m3.find();

        if (password.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else if (b1 && b2 && b3)
            System.out.println("Mật khẩu mạnh");
        else System.out.println("Mật khẩu chưa đủ mạnh");
    }
}
