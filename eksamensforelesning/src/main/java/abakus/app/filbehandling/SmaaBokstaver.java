package abakus.app.filbehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SmaaBokstaver {

    private final Path MY_PATH = Path.of("eksamensforelesning/src/main/java/abakus/app/filbehandling/store_bokstaver.txt");

    public SmaaBokstaver() throws IOException {
        List<String> ord = Files.readAllLines(MY_PATH);
        ord = ord.stream().map(i -> i.toLowerCase()).toList();
        Files.write(MY_PATH, ord);
    }

    public static void main(String[] args) throws IOException {
        new SmaaBokstaver();
    }
    
}
