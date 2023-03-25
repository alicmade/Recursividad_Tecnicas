package Apartado3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
        ejercicio.hexadecimal(255);
        System.out.println();
        int numero = 255;
        String hex = ejercicio.convertir_a_hexadecimal.apply(numero);
        ejercicio.imprimir.accept(hex);
    }
}
