package abakus.app.comparison;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

    private static final Comparator<Person> comp = Comparator.comparing((Person person) -> person.getSurname().toLowerCase())
            .thenComparing((Person person) -> person.getFirstName().toLowerCase());

    @Override
    public int compare(Person o1, Person o2) {
        return comp.compare(o1, o2);
    }

    
}