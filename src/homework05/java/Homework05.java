/*1. Работа с датами:
 1.1. Сравнить даты при оператора == и при помощи equals.
 1.2. Прибавить к дате + 5 дней и 1 месяц
 1.3. прибавить к дате 29 февраля 2020 года + 1 год
2. Создать энум страны:
 1. В котором есть 10 элементов
 2. У каждого элемента есть два свойства (площадь страны, количество человек)
 3. Добавить интерфейс с методами получения площади страны и количеством человек
 4. Энум должен реализовывать созданный интерфейс
 5. Воспользоваться методом valueOf передав туда название элемента энума
 6. Сравнить результат valueOf и элемент энума через оператор ==
 7. Передать в valueOf имя несуществующего элемента */

import java.util.Calendar;
import java.util.Date;

public class Homework05 {
    public static void task11() {
        System.out.println("1.1. Сравнить даты при оператора == и при помощи equals.");
        System.out.println((new Date() == new Date()) + " выпадает при ==, т.к. сравниваются ссылки");
        System.out.println(((new Date()).equals(new Date())) + " выпадает при .equals, т.к. сравниваются значения");
        System.out.println("______________________________________");
    }

    public static void task12() {
        System.out.println("1.2. Прибавить к дате + 5 дней и 1 месяц");
        Calendar cal = Calendar.getInstance();
        System.out.println("Текущее время: " + cal.getTime());
        cal.add(Calendar.DATE, 5); // 5 дней
        cal.add(Calendar.MONTH, 1); // 1 месяц
        System.out.println("Текущее время + 5 дней и 1 месяц: " + cal.getTime());

        System.out.println("______________________________________");
    }

    public static void task13() {
        System.out.println("1.3. прибавить к дате 29 февраля 2020 года + 1 год");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH , 1);
        cal.set(Calendar.DATE, 22);
        cal.set(Calendar.YEAR, 2020);
        System.out.println("Заданная дата:" + cal.getTime());
        cal.add(Calendar.YEAR, 1);
        System.out.println("Заданная дата + 1 год: " + cal.getTime());

        System.out.println("______________________________________");
    }

    public enum Countries {
        BELARUS ("Беларусь",100, 1000),
        RUSSIA ("Россия" ,200, 2000),
        USA ("Америка",300, 3000),
        UK ("Великобритания",400, 4000),
        SPAIN ("Испания",500, 5000),
        LITHUANIA ("Литва",600, 6000),
        LATVIA ("Латвия",700, 7000),
        POLAND ("Польша",800, 8000),
        UKRAINE ("Украина",900, 9000),
        AUSTRALIA ("Австралия",10000, 10000);

        private String title;
        private int square, population;

        Countries(String title, int square, int population)  {
            this.title = title;
            this.square = square;
            this.population = population;
        }

        public int getSquare(){
            return square;
        }

        public int getPopulation(){
            return population;
        }

        public String getTitle(){
            return title;
        }

        @Override
        public String toString() {
            return "Countries{" +
                    "title='" + title + '\'' +
                    ", square=" + square +
                    ", population=" + population +
                    '}';
        }



    }
    
    public static void task2() {
        System.out.println("Создать энум страны:\n" +
                " 1. В котором есть 10 элементов\n" +
                " 2. У каждого элемента есть два свойства (площадь страны, количество человек)\n" +
                " 3. Добавить интерфейс с методами получения площади страны и количеством человек\n" +
                " 4. Энум должен реализовывать созданный интерфейс\n" +
                " 5. Воспользоваться методом valueOf передав туда название элемента энума\n" +
                " 6. Сравнить результат valueOf и элемент энума через оператор ==\n" +
                " 7. Передать в valueOf имя несуществующего элемента");
        System.out.println(Countries.valueOf("BELARUS"));
        System.out.println("Сравнение valueOf и enum: " + (Countries.valueOf("BELARUS")==Countries.BELARUS));
        try {System.out.println(Countries.valueOf("MEXICO"));}
        catch(IllegalArgumentException i) { System.out.println("Имя несуществующего элемента передано в valueOf");}
        System.out.println("______________________________________");
    }

    public static void main(String[] args) {
        task11();
        task12();
        task13();
        task2();
    }


}
