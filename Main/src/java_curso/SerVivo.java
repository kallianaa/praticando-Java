package java_curso;

public abstract class SerVivo {

    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    // public abstract void respirar();

    public void dormir() {
        System.out.println("O ser vivo está dormindo.");
    }

        public void respirar() {
        System.out.println(this.idade);
        System.out.println("O humano está respirando.");
    }
}
