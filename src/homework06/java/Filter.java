import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Filter implements IFilter {

    @Override
    public <T> Collection<T> filter(Collection<T> collection, String filterType, int value) {

        Enumeration enumeration = Collections.enumeration(collection);
        List<Car> list = Collections.list(enumeration);
        if (filterType.equals("engineV")){
            list.removeIf(car -> car.getEngineV()>value);
        } else if (filterType.equals("year")){
            list.removeIf(car -> car.getYear()!=value);
        } else if (!filterType.equals("engineV") || !filterType.equals("year")){
            System.out.println("Wrong filter type. Only engineV or year accepted. Default engineV<2000 applied.");
            list.removeIf(car -> car.getEngineV()<2000);
        }


        return (Collection<T>) list;
    }

    @Override
    public <T> Collection<T> filter(Collection<T> collection) {
        System.out.println("bigger than 2000");
        Enumeration enumeration = Collections.enumeration(collection);
        List<Car> list = Collections.list(enumeration);
        list.removeIf(car -> car.getEngineV()<2000);

        return (Collection<T>) list;
    }
}
