package part_3.Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {

    private final String firstName;
    private final String lastName;
    private final String company;

    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public boolean performMaintenance(T t) {
        return t.diagnostics();
    }

    public void fixCar(T t) {
        t.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(firstName, mechanic.firstName) &&
                Objects.equals(lastName, mechanic.lastName) &&
                Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company);
    }
}
