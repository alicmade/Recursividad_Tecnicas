package Apartado4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
        System.out.println(ejercicio.EsPalindromo("DABALEARROZALAZORRAELABAD"));
        System.out.println(ejercicio.esPalindromoRecursivo("DABALEARROZALAZORRAELABAD"));

        System.out.println("Introduce una cadena para comprobar si es palindromo");
        String cadena = sc.nextLine();
        System.out.println("Según el metodo en el que aplicamos recursividad "+ejercicio.esPalindromoRecursivo(cadena));
        System.out.println("Según el metodo en el que no aplicamos recursividad "+ejercicio.EsPalindromo(cadena));


    }
}
