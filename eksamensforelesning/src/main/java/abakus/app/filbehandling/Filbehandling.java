package abakus.app.filbehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Filbehandling {
    private static final Path MY_FILE = Path.of("eksamensforelesning/src/main/java/abakus/app/filbehandling/byer_i_india.txt");
    // private final String myLetters = "acoprah";
    private List<String> cities;

    public Filbehandling() throws IOException {
        cities = Files.readAllLines(MY_FILE);
    }

    public String findCity(char... letters) throws Exception {
        if (letters.length == 0) {
            throw new IllegalArgumentException("Du må ha minst 1 bokstav >:(((");
        }
        Arrays.sort(letters);
        String letterString = new String(letters);
        return cities.stream()
        .map(city -> city.strip().toLowerCase())
        .filter(city -> city.chars()
            .sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString().equals(letterString))
        .findFirst().orElseThrow(Exception::new);
    }

    public static void main(String[] args) throws Exception {
        Filbehandling fil = new Filbehandling();
        String city = fil.findCity('o', 'p', 'r', 'a', 'a', 'h', 'c');  
        System.out.println(city);
    }
}
