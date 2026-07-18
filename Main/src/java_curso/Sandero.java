package java_curso;

public class Sandero implements Carro {

    final int limiteDeVelocidade = 150;
    public int velocidadeAtual = 0;


    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando");
        }
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
