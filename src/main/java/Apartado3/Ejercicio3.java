package Apartado3;

import java.util.function.*;

public class Ejercicio3 {
    public void hexadecimal (int num){
        if (num>0) {
            int resto = num%16;
            hexadecimal(num/16);
            if (resto<10) {
                System.out.print(resto);
            } else {
                switch (resto) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                }
            }
        }
    }
    /*Function <Integer, String> decimal_a_base = (n) -> {
        if (n == 0) {
            return "";
        } else {
            return decimal_a_base.apply(n / 16).replaceAll("^0+", "") + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(n % 16);
        }
    };

   UnaryOperator<Integer> dividir_por_16 = n -> n%16;

    Integer resultado = dividir_por_16.apply(255);


*/
     Function<Integer, String> convertir_a_hexadecimal = n -> {
        String hex = Integer.toHexString(n).toUpperCase();
        return hex.replaceAll("^0+", "");
    };

    Consumer<String> imprimir = texto -> System.out.println(texto);



}
