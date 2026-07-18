package java_curso;

public class Classes {

    public static void main(String[] args) {
        Carro meuCarro = new Sandero("Sandero");
        Carro meuCarro2 = new Mobi("Mobi");
        
        meuCarro.acelerar();
        meuCarro2.acelerar();


        SerVivo meuSer = new Humano();
        meuSer.respirar();

        
    }
}
