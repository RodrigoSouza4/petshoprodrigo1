package petshoprodrigo;

public class Banho extends Servico {

    public Banho(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro c) {
            return switch (c.getPorte().toLowerCase()) {
                case "pequeno" -> precoBase * 1.0;
                case "medio" -> precoBase * 1.2;
                case "grande" -> precoBase * 1.5;
                default -> precoBase * 1.1;
            }; 
        } else if (animal instanceof Gato) {
            return precoBase * 1.1;
        } else if (animal instanceof AnimalExotico) {
        return precoBase * 0.8;
        } else {
        return precoBase * 1.2;
    }
}

    @Override
    public String toString() {
        return super.toString() + ", tipo=Banho";
    }
}