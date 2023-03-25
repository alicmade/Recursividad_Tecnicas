package Apartado5;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class Ejericio5 {

    public void mcd(int m, int n) {
        if (m == n) {
            System.out.println("El mcd es: " + m);
        } else if (m > n) {
            mcd(m - n, n);
        } else {
            mcd(m, n - m);
        }
    }

    public void mcd2(int m, int n){
       do{
           if (m>n){
               m = restaMN.applyAsInt(m,n);
           } else if (n>m){
               n = restaNM.applyAsInt(m,n);
           }
       } while (m != n);
        imprimir.accept("El mcd es: " + m);
    }

    IntBinaryOperator restaMN = (int m, int n) -> m - n;
    IntBinaryOperator restaNM = (int m, int n) -> n - m;

    Consumer<String> imprimir = texto -> System.out.println(texto);

}
