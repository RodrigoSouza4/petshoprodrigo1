package petshoprodrigo;

import java.util.Objects;

public class Gato extends Animal {
    private final String corOlhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    @Override
public String toString() {
    return super.toString() + ", Gato{" +
            "corOlhos='" + corOlhos + '\'' +
            '}';
}

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Gato)) return false;
        Gato that = (Gato) o;
        return corOlhos.equals(that.corOlhos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), corOlhos);
    }
}