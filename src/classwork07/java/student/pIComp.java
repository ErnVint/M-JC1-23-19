package student;

import java.util.Comparator;

public class pIComp implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getId()<o2.getId()) return -1;
        if(o1.getId().equals(o2.getId()))return 0;
        return 1;
    }
}
