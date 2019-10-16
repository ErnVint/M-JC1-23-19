/*1. Строки, Референс типы, final:
        1.1. Сравнить две строки: "Мама мыла раму" и "Мама" + " мыла " + "раму" при помощи оператора == и получить результаты сравнения true.
        1.2. Вывести в консоль строку посимвольно
        1.3. Написать программу которая будет принимать строки введенные в консоли (через Scanner.in) и по окончанию (придумать как окончить
        выполнение ввода данных) вывести результат в одну строку в консоли
        1.4. Получить из строки "012312" переменную типа Long несколькими способами (изучите структуру класса Long)
        2. Регулярные выражения:
        2.1 Выполнить задание полученное на занятии Поиск в строке "Я люблю JAVA" при помощи регулярного выражения (h*, h+, h?).
        Объяснить что конкретно не работает.
        2.2. Найти в книге "Война и мир" (https://www.dropbox.com/s/vmpxj6bsnflvgdi/%D0%B2%D0%BE%D0%B9%D0%BD%D0%B0%20%D0%B8%20%D0%BC%D0%B8%D1%80.txt?dl=0)
// при помощи обычного поиска по строке и при помощи регуляных выражений. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести информацию
// как часто встречаются строки "война", "и" (как союз), "мир". Дать возможность через аргументы программы выбрать какое слово будем искать в тексте

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework04 {
    public static void homeWork11() {
        System.out.println("1.1. Сравнить две строки: \"Мама мыла раму\" и \"Мама\" + \" мыла \" + \"раму\" при помощи оператора == и получить результаты сравнения true.");
        boolean a = "Мама мыла раму" == ("Мама" + " мыла " + "раму");
        System.out.println(a);
        System.out.println("______________________________________");
    }

    public static void homeWork12(String string) {
        System.out.println("1.2. Вывести в консоль строку " + string + " посимвольно");
        char[] letters = string.toCharArray();
        String result;
        for (int i = 0; i < letters.length; i++) {
            result = (String.valueOf(letters[i]));
            System.out.println(result);
        }
        System.out.println("______________________________________");
    }

    public static void homeWork13() {
        System.out.println("1.3. Написать программу которая будет принимать строки введенные в консоли (через Scanner.in) и по окончанию (придумать как окончить\n" +
                "        выполнение ввода данных) вывести результат в одну строку в консоли");
        System.out.println("Type your text here(type \"exit\" to exit):");
        Scanner scan = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        boolean flag;
        do {
            flag = false;
            String input = scan.nextLine();
            if (!"exit".equals(input)) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(input);
                flag = true;
            }
        } while (flag);
        System.out.println(result);
        scan.close();
        System.out.println("______________________________________");
    }

    public static void homeWork14() {
        System.out.println("1.4. Получить из строки \"012312\" переменную типа Long несколькими способами (изучите структуру класса Long)");
        System.out.println("long a = Long.parseLong(\"012312\");");
        System.out.println("long b = Long.valueOf(\"012312\");");
        System.out.println("long c = new Long(\"012312\");");
        System.out.println("______________________________________");

    }

    public static void homeWork21() {
        System.out.println(" 2.1 Выполнить задание полученное на занятии Поиск в строке \"Я люблю JAVA\" при помощи регулярного выражения (h*, h+, h?).\n" +
                "        Объяснить что конкретно не работает.");
        String a1 = "IloveyouJAVA";
        System.out.println(a1.toLowerCase().contains("i"));
        System.out.println(a1.endsWith("JAVA"));
        System.out.println(a1.contains("JAVA"));
        System.out.println("\n\t\rregex " + a1.matches("\\h*, \\h+, \\h?")); //сравнивает всю строку целиком с паттерном
        System.out.println("______________________________________");
    }

    public static void homeWork22(String... word) throws FileNotFoundException {
        System.out.println("Найти в книге \"Война и мир\" (https://www.dropbox.com/s/vmpxj6bsnflvgdi/%D0%B2%D0%BE%D0%B9%D0%BD%D0%B0%20%D0%B8%20%D0%BC%D0%B8%D1%80.txt?dl=0)\n" +
                "// при помощи обычного поиска по строке и при помощи регуляных выражений. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести информацию\n" +
                "// как часто встречаются строки \"война\", \"и\" (как союз), \"мир\". Дать возможность через аргументы программы выбрать какое слово будем искать в тексте");
        for (int i = 0; i < word.length; i++) {
            File file = new File("/Users/ernvint/IdeaProjects/Car/src/homework04/java/Война и мир.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scan = new Scanner((fileReader));
            int counter = 0;
            while (scan.hasNextLine()) {
                Pattern pattern = Pattern.compile(word[i]);
                Matcher matcher = pattern.matcher(scan.nextLine());
                if (matcher.find()) {
                    counter++;
                }
            }
            System.out.println("Слово " + word[i] + " повторяется " + counter + " раз.");
            scan.close();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        homeWork11();
        homeWork12("asdf");
        homeWork13();
        homeWork14();
        homeWork21();
        homeWork22("Война", "мир", "война", "очень сильно");
    }
}
