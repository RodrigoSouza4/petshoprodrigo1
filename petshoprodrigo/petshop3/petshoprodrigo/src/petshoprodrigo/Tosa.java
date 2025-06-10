package petshoprodrigo;

public class Tosa extends Servico {

    public Tosa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro c) {
            return switch (c.getPorte().toLowerCase()) {
                case "pequeno" -> precoBase * 1.0;
                case "medio" -> precoBase * 1.2;
                case "grande" -> precoBase * 1.4;
                default -> precoBase * 1.1;
            };
    } else if (animal instanceof Gato) {
            throw new IllegalArgumentException("Tosa não disponível para esse tipo de animal.");
    } else if (animal instanceof AnimalExotico) {
        throw new IllegalArgumentException("Tosa não disponível para esse tipo de animal.");
    } else {
        return precoBase * 1.3;
    }
}

    @Override
    public String toString() {
        return super.toString() + ", Tosa{}";
    }
}