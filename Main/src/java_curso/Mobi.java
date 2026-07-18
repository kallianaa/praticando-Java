package java_curso;

public class Mobi implements Carro {

    String modelo;

    public Mobi(String modelo) {
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
