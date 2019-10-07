
public class Homework2Main {
    public static void main(String[] args) {

        // 00000000 0
        // 00000001 1
        // 00000010 2
        // 00000011 3 !!! это для себя
        // 00000100 4
        //сдвиг влево это умножение на 2 по сути

        int a = 1;
        System.out.println(a = a << 2); //сдвиг влево, количество символов 2

        int b = 35;
        System.out.println(b = b >> 2); //сдвиг вправо на 2 остаток забывается

        int c = -15;
        System.out.println(c = c << 2); //сдвиг влево на 2 отрицательное число

        int d = -1;
        System.out.println(d = d >> 20); //всегда -1
        System.out.println(d = d >>> 20); // >>> игнорирует знак

        //System.out.println(int e = a^b); не работает?

        int e;
        //byte[] f = 00001010; попытка обьявления переменной в двоичной системе для наглядности, не получилось

        System.out.println(e = a&b);
        System.out.println(e = a^b); //XOR из 4 и 8








    }
}
