import java.util.*;

public class CustomTreeSet<E> {
    private static final Object object = new Object();
    private TreeMap<E, Object> tm = new TreeMap<>();

    public boolean add(E e){
        return  tm.put(e, object) == null;
    }

    @Override
    public String toString() {
        return tm.keySet().stream().sorted().toString();
    }
}
