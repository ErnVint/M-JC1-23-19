import java.util.*;

public class FilterApplicator<T extends Collection> {
        public static <T> Collection<T> filter (Collection<T> collection, Filter filter){
                return filter.filter(collection);
        }

        public static <T> Collection<T> filter (Collection<T> collection, Filter filter, String filterType, int value){
        return filter.filter(collection, filterType, value);
        }


        public static Collection<? extends Comparable> sort (Collection<? extends Comparable> collection){

            Enumeration enumeration = Collections.enumeration(collection);

            List sortedCollection = Collections.list(enumeration);

            Collections.sort(sortedCollection);

            return  sortedCollection;
        }
}
