package petshoprodrigo;

import java.util.Objects;

public class Cachorro extends Animal {
    private final String porte;

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cachorro{" +
                "porte='" + porte + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Cachorro)) return false;
        Cachorro that = (Cachorro) o;
        return porte.equals(that.porte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), porte);
    }

    public String getPorte() {
        return porte;
    }
}