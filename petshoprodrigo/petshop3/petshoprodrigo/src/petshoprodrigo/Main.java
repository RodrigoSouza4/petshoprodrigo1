package petshoprodrigo;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Theo", "Labrador", 5, "Carlos", "Grande");
        Animal gato = new Gato("Luna", "Siamês", 3, "Ana", "Verdes");
        Animal AnimalExotico = new AnimalExotico("Nina", "Furão", 2, "Lucas", "Sim");
        Animal OutroAnimal = new OutroAnimal("Kyra", "Coelho", 4, "Patricia", "Coelho Anão");

        Servico banho = new Banho("Banho", 60.0);
        Servico tosa = new Tosa("Tosa", 90.0);
        Servico consulta = new ConsultaVeterinaria("Consulta", 150.0);

        System.out.println(cachorro);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(cachorro));
        System.out.println("Preço Tosa: R$" + tosa.calcularPreco(cachorro));
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(cachorro));
        System.out.println();

        System.out.println(gato);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(gato));
        try {
            System.out.println("Preço Tosa: R$" + tosa.calcularPreco(gato));
        } catch (IllegalArgumentException e) {
            System.out.println("Tosa não disponível para Gato.");
        }
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(gato));
        System.out.println();

        System.out.println(AnimalExotico);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(AnimalExotico));
        try {
        System.out.println("Preço Tosa: R$" + tosa.calcularPreco(AnimalExotico));
        } catch (IllegalArgumentException e) {
            System.out.println("Tosa não disponível para esse tipo de animal.");
        }
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(AnimalExotico));
        System.out.println();
        
        System.out.println(OutroAnimal);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(OutroAnimal));
        System.out.println("Preço Tosa: R$" + tosa.calcularPreco(OutroAnimal));
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(OutroAnimal));
        System.out.println();
    }
}
