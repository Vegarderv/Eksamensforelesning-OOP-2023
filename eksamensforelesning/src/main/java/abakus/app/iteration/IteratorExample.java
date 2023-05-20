package abakus.app.iteration;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Iterable<String> list = Arrays.asList("H", "e", "i", "p", "å");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            // Do stuff
        }

        for (String str : list) {
            // Do stuff
        }
    }
}
