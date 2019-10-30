import java.util.Collection;

public interface IFilter {
    <T> Collection<T> filter (Collection<T> collection);
    <T> Collection<T> filter(Collection<T> collection, String filterType, int value);
}
