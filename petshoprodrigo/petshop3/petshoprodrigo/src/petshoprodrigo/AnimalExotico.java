package petshoprodrigo;

import java.util.Objects;

public class AnimalExotico extends Animal {
    final String exotico;

    public AnimalExotico(String nome, String racaTipo, int idade, String proprietario, String exotico) {
        super(nome, racaTipo, idade, proprietario);
        this.exotico = exotico;
    }

    @Override
    public String toString() {
        return super.toString() + ", AnimalExotico{" +
                "Exótico?='" + exotico + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof AnimalExotico)) return false;
        AnimalExotico that = (AnimalExotico) o;
        return exotico.equals(that.exotico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), exotico);
    }
}
