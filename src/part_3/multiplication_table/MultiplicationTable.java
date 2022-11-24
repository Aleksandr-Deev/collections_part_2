package part_3.multiplication_table;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class MultiplicationTable {

    private final Set<Number> numbers = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (numbers.size() < 15) {
            numbers.add(new Number(random.nextInt(10),
            random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "numbers=" + numbers +
                '}';
    }
}