package part_3.multiplication_table;

import java.util.Objects;

public class Number {

    private final int value1;
    private final int value2;

    public Number(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Number number = (Number) o;
        return (value1 == number.value1 && value2 == number.value2) ||
                (value1 == number.value2 && value2 == number.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 + value2, value1 * value2);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ?", this.value1, this.value2);
    }
}
