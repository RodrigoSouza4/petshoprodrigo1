package petshoprodrigo;

import java.util.Objects;

public class ConsultaVeterinaria extends Servico {

    public ConsultaVeterinaria(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof OutroAnimal) {
            return precoBase * 1.5 + 30; 
        } else if (animal instanceof Gato) {
            return precoBase + 40; 
        } else {
            return precoBase + 20; 
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ConsultaVeterinaria{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsultaVeterinaria)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}