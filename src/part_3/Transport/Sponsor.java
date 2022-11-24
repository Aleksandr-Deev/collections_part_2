package part_3.Transport;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private final int amountSupport;

    public Sponsor(String name, int amountSupport) {
        this.name = name;
        this.amountSupport = amountSupport;
    }

    public String getName() {
        return name;
    }

    public int getAmountSupport() {
        return amountSupport;
    }

    public void sponsorRace() {
        System.out.println("Спонсор " + getName() + " проспонсировал заезд на сумму " + getAmountSupport());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
