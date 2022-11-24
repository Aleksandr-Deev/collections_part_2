package part_3.Passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final int number;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate localDate;

    public Passport (int number, String lastName, String firstName, String middleName, LocalDate localDate) {
            this.number = number;
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.localDate = localDate;
    }

    public int getNumber() {
            return number;
    }

    public String getLastName() {
            return lastName;
    }

    public String getFirstName(){
            return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
            return localDate;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
