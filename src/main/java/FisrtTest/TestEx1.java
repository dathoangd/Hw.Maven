package FisrtTest;

public class TestEx1 {

    public static int countUpperCase(String s) {
        int count = 0;
        for( int i=0; i< s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }

    public static void upperCase(String s){
        char[] charArray = s.toCharArray();
        boolean isSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(isSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    isSpace = false;
                }
            }
            else {
                isSpace = true;
            }
        }
        s = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi được in hoa chữ cái đầu: \n" + s);
    }

}
