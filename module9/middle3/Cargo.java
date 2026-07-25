package module9.middle3;

import java.util.Objects;

public class Cargo {
    private double weight;
    private String name;

    public Cargo(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cargo that = (Cargo) obj;
        return Double.compare(that.weight, weight) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }
}
