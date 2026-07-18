package java_curso;

public class Sandero implements Carro {

    String modelo;

    public Sandero(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro " + modelo + " está parando.");
    }

}
