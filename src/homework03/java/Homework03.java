import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework03 {

    public static void homeWork11() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i*j;
                if (result < 10) {
                    System.out.print(String.format(" %s ", result));
                    //System.out.print(" " + result + " ");
                } else {
                    System.out.print(result + " ");
                }
                //System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("______________________________________");
    }

    public static void homeWork12(long max) {
        long result = 1;
        for (int i = 1; i <= max; i++) {
            result = result * i;
            System.out.println(result);
        }
        System.out.println("______________________________________");
    }

    public static void homeWork13(String number) {

        char[] digits = number.toCharArray();
        long result = 1L;
        for (int i = 0; i < digits.length; i++) {
            result = result * Integer.parseInt(String.valueOf(digits[i]));
            System.out.println(result);
        }
        System.out.println("______________________________________");
    }

    public static void homeWork21(String[] xyz) {
        int pointer = 0;
        do {
            System.out.println(xyz[pointer]);
            pointer++;
        } while (pointer < xyz.length);
        pointer = 0;
        while (pointer < xyz.length) {
            System.out.println(xyz[pointer]);
            pointer++;
        }
        for (String a : xyz) {
            System.out.println(a);
        }
        System.out.println("______________________________________");
    }

    public static void homeWork22(String[] xyz) {
        int pointer = 1;
        do {
            System.out.println(xyz[pointer]);
            pointer = pointer+2;
        } while (pointer < xyz.length);
        System.out.println("______________________________________");
    }

    public static void homeWork23(String[] xyz) {
        int pointer = 1;
            do {
                if (xyz[pointer] == null) {
                    break;
                }
                System.out.println(xyz[pointer]);
                pointer = pointer + 2;
            } while (pointer < xyz.length);
        System.out.println("______________________________________");
    }

    public static void homeWork3(Object[] hw3) {
        for (Object x: hw3) {
            System.out.println(x.getClass().toString());
            System.out.println(x.toString());
        }
        System.out.println("______________________________________");
    }

    public static void taskToDoTill111019() {
        String pattern_phonenumber = "((\\+|8|0){1}((\\d|(|)|s){8,11})$)";
        //String pattern_phonenumber = "^(?:\\d{8}(?:\\d{2}(?:\\d{2})?)?|\\(\\+?\\d{2,3}\\)\\s?(?:\\d{4}[\\s*.-]?\\d{4}|\\d{3}[\\s*.-]?\\d{3}|\\d{2}([\\s*.-]?)\\d{2}\\1\\d{2}(?:\\1\\d{2})?))$\n";
        Pattern pattern = Pattern.compile(pattern_phonenumber);
        String[] phonenum = new String[]{
                "+375 29 5553628", "I love you",
                "+375(29)5553628", "8029",
                "+375(29)444-99-02", "+7(129)444-99-0244444444444444"
        };

        for (String tel: phonenum
        ) {

            System.out.println(tel);
            Matcher matcher = pattern.matcher(tel);
            System.out.println(matcher.find());

        }

    }


    public static void main(String[] args) {
        homeWork11();
        homeWork12(Long.parseLong(args[0]));
        homeWork13(args[1]);
        homeWork21(new String[]{"123123", "dfgdfgdg", "kukykuy"});
        homeWork22(new String[]{"123123", "dfgdfgdg", "kukykuy", "dafas"});
        homeWork23(new String[]{"123123", "dfgdfgdg", "kukykuy", null, "123123", "dfgdfgdg", "kukykuy"});
        homeWork3(new Object[]{10, "a", 12L});
        taskToDoTill111019();

    }

}
