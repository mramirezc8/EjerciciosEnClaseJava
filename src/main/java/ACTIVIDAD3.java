import java.util.Locale;
import java.util.Scanner;

public class ACTIVIDAD3 {

/*Escribe un programa que verifique si una cadena de texto es un palíndtomo.
  un palindromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual de adelante hacia atras
  y de atrás hacia adelante (ignorando espacios, puntos y mayúsculas
 */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String palabraUsuario;

    char [] palindromo;

    int Derecha, Izquierda;

    System.out.println("Ingresa una palabra");
    palabraUsuario = scanner.nextLine();
    palabraUsuario = palabraUsuario.toLowerCase();
    palabraUsuario = palabraUsuario.replace (" ","");
    palindromo = palabraUsuario.toCharArray();

    Derecha = 0;
    Izquierda = palindromo.length - 1;


while (Derecha < Izquierda) {
    if(palindromo[Derecha] == palindromo[Izquierda]){
        Izquierda --;
        Derecha ++;


    }else {
        System.out.println("La palabra no corresponde a un palindromo");
        break;
    }
}



if (Derecha == Izquierda){
   System.out.println("La palabra es un palindromo");
}











 }















}
