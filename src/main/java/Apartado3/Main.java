package Apartado3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
       /* ejercicio.hexadecimal(255);
        System.out.println();
        int numero = 255;
        String hex = ejercicio.convertir_a_hexadecimal.apply(numero);
        ejercicio.imprimir.accept(hex);
        String binario = ejercicio.convertir_a_base.apply(10);
        System.out.println(binario);
         //  String base = ejercicio.convertir_a_base2.apply(10);
        //System.out.println(base);*/

        System.out.println("Que numero quieres convertir ?");
        int num = sc.nextInt();
        System.out.println("sobre que base quieres convertir el numero?");
        int base = sc.nextInt();
        ejercicio.setB(base);
        String resultado = ejercicio.convertir_a_base2.apply(num);
        ejercicio.imprimir.accept(resultado);
    }
}
