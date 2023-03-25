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
    /*a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función recursiva f(x,2)?
    ¿Cuál sería un nombre más adecuado para la función f? Se va mostrando por la pantalla todos los divisores de parámetro x hasta
    que se reduce a un número que solo se puedoe dividir por si mismo (primo), está factorizando. Primero comprueba que sea mayor que 1,
    ya que sino no tendría números primos. comprueba si el divisor daría un resultado igual a 0 y sino lo aumenta 1 hasta encontrar un
    número que lo haga, utilizanco la recursividad y llamando a la función otra vez. Cuando lo encuentra lo divide y vuelve a llamar a
    la función para mostrar todos los números. Por ello, el nombre que debería tener la función es factorización.

     */
    /* He dejado las dos forma con recursividad y de forma iterativa para ver la diferencia de forma más clara*/
}
