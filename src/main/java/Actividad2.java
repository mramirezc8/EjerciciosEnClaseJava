import java.util.Scanner;

public class Actividad2 {

    /*El programa pedirá al usuario que ingrese un número entero positivo.
      Luego, el programa imprimirá todos los números desde 1 hasta el número ingresado,
      indicando si cada número es par o impar.*/

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un número entero positivo");
          int numero = scanner.nextInt();



        for (int i= 0; i <= numero; i++) {
          if(i%2 == 0) {

              System.out.println(i + "Número par");
          }else {
              System.out.println(i + "Numero impar");
          }

        }

    }

}

