package abakus.app.comparison;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonComparator implements Comparator<Person>{

    public int square(int x) {
        return (int) Math.pow(x, 2);
    }

    public List<Integer> tall = Arrays.asList(1,2,3);

    private static final Comparator<Person> comp = Comparator.comparing((Person person) -> person.getSurname().toLowerCase())
            .thenComparing((Person person) -> person.getFirstName().toLowerCase());

    @Override
    public int compare(Person o1, Person o2) {
        //return comp.compare(o1, o2);
        int surename = o1.getSurname().compareTo(o2.getSurname());
        if (surename != 0) {
            return surename;
        }
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

    public void listeOmgjører() {
        tall.stream().map(x -> Math.pow(x, 2));
    }
}