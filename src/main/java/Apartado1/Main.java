package Apartado1;

import java.util.Scanner;

public class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    Ejercicio1 e1 = new Ejercicio1();
    double min = 0;
    double max = 2;
    double root = e1.bisect(min, max);
    System.out.println("La raíz cuadrada de " + e1.getN() + " es " + root);

    // Ahora probamos con otro valor de N
        System.out.println("Ahora calculamos la raíz de valor que introduzacas: ");
        double numero = sc.nextDouble();
         e1.setN(numero);
            root = e1.bisect(min, max);
            System.out.println("La raíz cuadrada de " + e1.getN() + " es " + root);

    }
}