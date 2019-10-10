
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

        int b = 8;
        System.out.println(b = b >> 2); //сдвиг вправо на 2 остаток забывается

        int c = -15;
        System.out.println(c = c << 2); //сдвиг влево на 2 отрицательное число

        int d = -1;
        System.out.println(d = d >> 20); //всегда -1
        System.out.println(d = d >>> 20); // >>> игнорирует знак

        //System.out.println(int e = a^b); не работает?

        int e;
        //byte[] f = 00001010; попытка обьявления переменной в двоичной системе для наглядности, не получилось
        System.out.println(e = a|b); //побитовый OR any 1 is 1
        //|| это или в выражениях bool
        System.out.println(e = a&b); //побитовый AND both 1 is 1
        //&& это и в выражениях bool
        System.out.println(e = a^b); //XOR only 1 is 1

        if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>b");
        }

        //int ternar = 1 < 2 ? System.out.println("a<b") : System.out.println("a>b");
        int ternary = a < b ? a : b;
        System.out.println("ternary " + ternary);

        //Plane airbus1 = (Airbus) new Plane(); //ClassCastException
        Plane boening = new Boening(); //ClassCastException exit
        Boening.check(boening);

        int ex1 = 5 + 2 / 8; //деление - результат 0 целой части, сложение - итог 5
        int ex2 = (5 + 2) / 8;//сложение, деление - итог 0 целой части
        int ex3_1 = 2;
        int ex3 = (5 + ex3_1++) / 8;//++ справа отрабатывает после знака равенства, итог 0
        ex3_1 = 2;
        int ex4_1 = 8;
        int ex4 = ((5 + ex3_1++) / --ex4_1);//++ справа после равно, -- слева перед равно, итог 1
        ex3_1 = 2;
        ex4_1 = 8;
        int ex5 = (5 * 2 >> ex3_1++) / --ex4_1;// сначала --, потом *, потом /, потом сдвиг итог 0
        ex3_1 = 2;
        ex4_1 = 8;
        int ex6 = (5 + 7 > 20 ? 68 : 22 * 2 >> ex3_1++) / --ex4_1;//сначала --, потом +, сдвиг, тернарное,деление итог
        ex3_1 = 2;
        //int ex7 = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> ex3_1++) / --ex4_1;
        boolean ex_7_1 = 5 + 7 > 20; //false значит идем во вторую часть тернарного выражения
        int ex_7_2 = 22 * 2 >> ex3_1++; //44/4=4
        int ex7 = ex_7_2 / --ex4_1;

        boolean ex8 = (6 - 2 > 3 && 12 * 12 <= 119);//получает в конце true&&false && возвращает false если оба не true

        boolean ex9 = true && false; //false && возвращает false если оба не true

        System.out.println(ex1);
        System.out.println(ex2);

        System.out.println(ex3);

        System.out.println(ex4);
        System.out.println(ex5);
        System.out.println(ex6);
        System.out.println(ex7);
        System.out.println(ex8);
        System.out.println(ex9);

    }

}
