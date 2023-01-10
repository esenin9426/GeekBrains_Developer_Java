import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CustomLincedList implements Iterable<Integer> {
    private int size = 0;
    private List<Integer> list = new ArrayList<Integer>();

    public CustomLincedList(List<Integer> list) {
        list.addAll(list);
        size += list.size();
    }

    public CustomLincedList() {
    }

    public boolean add(Integer e){
        list.add(e);
        size++;
        return true;
    }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < list.size();
            }

            @Override
            public Integer next() {
                return list.get(i++);
            }
        };
    }

}
