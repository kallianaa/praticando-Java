package java_curso;

public class Mobi implements Carro {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando.");
    }

}
