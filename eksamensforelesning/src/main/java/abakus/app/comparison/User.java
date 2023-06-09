package abakus.app.comparison;

public class User implements Person, Comparable<Person> {

    private final String firstName, surname;

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }
    
    @Override
    public int compareTo(Person person1) {
        return new PersonComparator().compare(this, person1);
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", surname=" + surname + "]";
    }
}