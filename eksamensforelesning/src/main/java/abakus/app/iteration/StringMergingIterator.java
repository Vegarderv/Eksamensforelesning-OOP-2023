package abakus.app.iteration;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringMergingIterator implements Iterator<String> {

    private Iterator<String> i1, i2;
    private int turn = 0;

    public StringMergingIterator(String s1, String s2) {
        this.i1 = Arrays.asList(s1.split("")).iterator();
        this.i2 = Arrays.asList(s2.split("")).iterator();
    }

    @Override
    public boolean hasNext() {
        return i1.hasNext() || i2.hasNext();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new IllegalStateException();
        }
        if (turn == 0 || !i2.hasNext()) {
            turn = 1;
            return i1.next();
        } else if (turn == 1 || !i1.hasNext()) {
            turn = 0;
            return i2.next();
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        StringMergingIterator stringMergingIterator = new StringMergingIterator("ABCDE", "XYZ");

        while (stringMergingIterator.hasNext()) {
            System.out.print(stringMergingIterator.next());
        }
    }
    
    
}