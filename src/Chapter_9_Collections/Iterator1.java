package Chapter_9_Collections;

import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        Collection<String> c =...;
        Iterator<String> iter = c.iterator();
        while (iter.hasNext())
        {
            String element = iter.next();
        }
    }
}
