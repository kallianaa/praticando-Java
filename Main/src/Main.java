import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        byte b = 100;
        short s = 10000;
        int j = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        String str = "Hello, Java!";
        boolean bool = true;

        // System.out.println("Byte: " + b);
        // System.out.println("Short: " + s);
        // System.out.println("Int: " + i);
        // System.out.println("Long: " + l);
        // System.out.println("Float: " + f);
        // System.out.println("Double: " + d);
        // System.out.println("Char: " + c);
        // System.out.println("String: " + str);



        // if (bool) {
        //   System.out.println("VERDADEIRO.");
        // } else {
        //   System.out.println("FALSO.");
        // }

        // int[] colecaoDeInteiros = { 1, 2, 3, 4, 5 };
        // int[] meuNumeros = new int[5];

        // System.out.println("Coleção de Inteiros: ");


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Nala");
        nomes.add("Bob");
        nomes.add("Tom");
        nomes.add("Charlie");

        // System.out.println(nomes.get(0));

        // nomes.remove(0);

        // System.out.println(nomes.get(0));



      // for (int i = 0; i < nomes.size(); i++) {
      //     System.out.println(nomes.get(i));
      // }



      // for (String nome : nomes) {
      //     System.out.println(nome);
      // }

      // int contador = 0;
      // while (contador < 10) {
      //     System.out.println("Contador: " + contador);
      //     contador++;
      // }

      double resultado = 0.0;
      int resultadoInt = (int) resultado;
      System.out.println("Resultado: " + resultado);
      

      int meuInt = 10;
      double meuDouble = meuInt; // Conversão implícita de int para double
      System.out.println("Meu Double: " + meuDouble);

      String meuString = "123";
      int meuIntConvertido = Integer.parseInt(meuString); // Conversão de String

      
    }
}
