package java_curso;

public class Classes {

    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();
        
        meuCarro.acelerar();
        meuCarro2.acelerar();


        SerVivo meuSer = new Humano();
        meuSer.respirar();

        Carro meuCarroFurado = null;

        try{
            meuCarroFurado.acelerar(); // Isso vai lançar uma NullPointerException
        } catch (NullPointerException exception) {
            System.out.println("Vende este carro, ele está furado!");
        }
    }
}
