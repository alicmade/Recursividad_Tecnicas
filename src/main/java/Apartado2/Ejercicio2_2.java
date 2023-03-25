package Apartado2;

import java.util.function.IntBinaryOperator;
import java.util.ArrayList;


public class Ejercicio2_2 {

    public void factorial(int num, int div) {
        ArrayList<Integer> dividendos2 = new ArrayList<>();

        while (div <= num){
            if ((num%div) == 0) {
                dividendos2.add(div);
               // num = miMetodoLambda.applyAsInt(num, div);
                //f(num/div,div);
            } else {
                div +=1;
            }

        }
        // metodo lambda para imprimir el array
        dividendos2.forEach(divisor2 -> System.out.println(divisor2));
    }
    // método lambda para dividir
    IntBinaryOperator miMetodoLambda = (int num, int div) -> num / div;



}
