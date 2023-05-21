package abakus.app.iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TallListe implements Iterable<Integer> {

    private List<Integer> mineTall = Arrays.asList(4, 5, 22, 24);

    @Override
    public Iterator<Integer> iterator() {
        return mineTall.iterator();
    }
    
}
