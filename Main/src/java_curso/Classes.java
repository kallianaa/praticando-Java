package java_curso;

public class Classes {

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");
        Carro carro1 = new Carro("Gol");
        Carro carro2 = new Carro("Civic");

        String result = carro.acelerar();
        carro.acelerar();
        carro1.acelerar();
        carro2.acelerar();


        System.out.println(result);
    }

}
