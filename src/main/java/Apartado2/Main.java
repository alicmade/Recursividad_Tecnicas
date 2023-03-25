package Apartado2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ejercicio2_1 ejercicio = new Ejercicio2_1();
        System.out.println("Que numero quieres factorizar?");
        int num = sc.nextInt();
        System.out.println("Por que numero quieres empezar a factorizar?");
        int div = sc.nextInt();
        ejercicio.factorial(num,div);

        //con métodos lambdas
        Ejercicio2_2 ejercicio2 = new Ejercicio2_2();
        System.out.println("Que numero quieres factorizar?");
        int num2 = sc.nextInt();
        System.out.println("Por que numero quieres empezar a factorizar?");
        int div2 = sc.nextInt();
        ejercicio2.factorial(num2,div2);

    }
    /* He dejado las dos forma con recursividad y de forma iterativa para ver la diferencia de forma más clara*/
}
