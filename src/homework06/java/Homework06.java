import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

@Version
public class Homework06 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание (выполнить до 23.10):\n" +
                "1. Написать свою аннотацию @Version которая будет иметь поле String value для хранения номера версии. \n" +
                "   Аннотацию можно проставлять на класс и конструктор\n" +
                "2. Написать дженерик класс FilterApplicator который умеет обрабатывать коллекцию ЛЮБЫХ элементов будет иметь следующие методы:\n" +
                " 2.1. статический метод filter. У метода filter будет два параметра. \n" +
                "      1 коллекция в которой будет происходить фильтрация, \n" +
                "      2 класс который реализует алгоритм фильтрации. \n" +
                "      И будет возвращать результат фильтрации\n" +
                " 2.2. статический ДЖЕНЕРИК МЕТОД sort который будет принимать 1 параметр коллекцию элементов реализующих интерфейс Comparable. \n" +
                "      И будет возвращать результат сортировки");
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "320", 2012, 1987));
        carList.add(new Car("BMW", "520", 2014, 1977));
        carList.add(new Car("Audi", "A4", 2016, 1396));
        carList.add(new Car("Audi", "A5", 2008, 3200));
        carList.add(new Car("Mercedes", "S320", 2006, 3194));
        carList.add(new Car("Citroen", "C5", 2005, 1798));
        carList.add(new Car("Citroen", "Xsara Picasso", 2003, 1988));
        carList.add(new Car("Citroen", "C5", 2005, 1898));
        Scanner typeIn = new Scanner(System.in);
        System.out.println("Type year or engineV sort:");
        String filterType = typeIn.nextLine();
        System.out.println("Type value:");

        try{int value = Integer.parseInt(typeIn.nextLine());
            Filter filter2 = new Filter();
            Collection filteredCarList2 = FilterApplicator.filter(carList, filter2, filterType, value);
            for (Object x : filteredCarList2) { System.out.println(x);}}
        catch (NumberFormatException e) {
            System.out.println("Wrong value");
        }
        System.out.println("___________________________________");
        System.out.println("Sort:");
        ArrayList<Car> sortedCarList = (ArrayList<Car>) FilterApplicator.sort(carList);
        for (Object x : sortedCarList) { System.out.println(x);}






    }

}
