package java_curso;

public class Carro {

    String modelo;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

        public Carro(String modelo) {
            this.modelo = modelo;
        }

    public String acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
        return "O carro " + modelo + " está acelerando.";
    }

    class Rodas{
        public Rodas() {
            Carro carro = new Carro("BMW");
            carro.acelerar();
        }
    }
}
