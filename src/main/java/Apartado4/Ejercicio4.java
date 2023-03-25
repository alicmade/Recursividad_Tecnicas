package Apartado4;

public class Ejercicio4 {
    public boolean EsPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replace(" ", "");
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();
        return cadenaSinEspacios.equalsIgnoreCase(cadenaInvertida);
    }

    public static boolean esPalindromoRecursivo(String texto) {
        if (texto.length() <= 1) {
            return true; //la cadena vacía o de un solo carácter es un palíndromo
        } else if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {
            return esPalindromoRecursivo(texto.substring(1, texto.length() - 1));
        } else {
            return false;
        }
    }

}
