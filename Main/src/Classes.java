public class Classes {

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");
        Carro carro1 = new Carro("Gol");
        Carro carro2 = new Carro("Civic");

        carro.acelerar();
        carro1.acelerar();
        carro2.acelerar();

    }

}

class Carro{
    String modelo;


    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }
}