package petshoprodrigo;

import java.util.Objects;

public class OutroAnimal extends Animal {
    final String tipoEspecifico;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String toString() {
        return super.toString() + ", OutroAnimal{" +
                "tipoEspecifico='" + tipoEspecifico + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof OutroAnimal)) return false;
        OutroAnimal that = (OutroAnimal) o;
        return tipoEspecifico.equals(that.tipoEspecifico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoEspecifico);
    }
}