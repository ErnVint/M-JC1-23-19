import student.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Classwork10 {
    public static void main(String[] args) {
//@TODO записать коллекцию в мапу не не хеш мапу используя коллект

        Stream.generate(()->{
            int id = new Random().nextInt();
            String pers = String.valueOf(new Random().nextFloat());
            float score = (float) Math.round(new Random().nextFloat()*1000)/100;
            return new Person(id, pers, score);
        } ).limit(10000).forEach(System.out::println);

    }

    void listtt(){
        List<Person> students = new ArrayList<>();
        students.add(new Person(1,"fdbvmo", 434));
        students.add(new Person(12,"ds", 33));
        students.add(new Person(9,"fgbgnh", 765));
        students.add(new Person(3,"dsaed", 45));
        students.add(new Person(66,"dsa", 343));
        // students.stream().forEach(x ->System.out.println(x.getName()));

        Map<Integer,Person> map1 = new TreeMap<>();
        students.stream().forEach(a -> map1.put(a.getId(),a));
        //  System.out.println(map1);

        Map<Integer,Person> map2 = students.stream().collect(Collectors.toMap(Person::getId, x->x));
        //  System.out.println(map2);
        map2.forEach((k, v) -> System.out.println(k));
    }

    void intList() {
        List <Integer> integerList = new ArrayList<Integer>();

        integerList.add(3);
        integerList.add(7);
        integerList.add(10);
        integerList.add(40);
        long count = integerList.stream()
                .filter(x->x%2==0)
                .count();
        //       .forEach(System.out::println);
        System.out.println(count);
        System.out.println(integerList);
        System.out.println("___________________________");

        integerList.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
        System.out.println("___________________________");
        integerList.stream()
                .filter(x->x%2==0)
                .peek(System.out::println)
                .count();
    }
}
