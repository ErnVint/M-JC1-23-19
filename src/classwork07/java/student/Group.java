package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {

    public static void main(String[] args) {
        Comparator<Person> pIComp = new pIComp();
        Comparator<Person> pNComp = new pNComp();
        Comparator<Person> pVComp = new pVComp();
        List<Person> students = new ArrayList<>();
        students.add(new Person(1,"Вика", 3.f));
        students.add(new Person(6,"Sasha", 4.f));
        students.add(new Person(3,"Настя", 1.f));
        students.add(new Person(4888,"Катя", 9.f));
        students.add(new Person(5,"Петя", 8.f));
        students.add(new Person(66,"Леша", 1.f));
        students.add(new Person(2,"Аня", 10.f));
        Collections.sort(students, pIComp);
        Collections.sort(students, pNComp);
        Collections.sort(students, pVComp);
        System.out.println(students);

    }
}
