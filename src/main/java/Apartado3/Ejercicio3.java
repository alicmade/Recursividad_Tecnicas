package Apartado3;

import java.util.function.*;

public class Ejercicio3 {
    //metodo con recursividad
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

    //metodo con lambda
     Function<Integer, String> convertir_a_hexadecimal = n -> {
        String hex = Integer.toHexString(n).toUpperCase();
        return hex.replaceAll("^0+", "");
    };


    //metodo con lambda para pasar a binario en caso de que lo quisieramos camnbiar de
    //base habría q cambiar el 2 por la base que quisieramos
    Function<Integer, String> convertir_a_base = n -> {
        String hex = Integer.toString(n, 2);
        return hex.replaceAll("^0+", "");
    };

    //metodo con lambda genralizado para cualquier base
    int B = 3;
    Function<Integer, String> convertir_a_base2 = n -> {
        int base = B;
        String simbolos = "0123456789"; //según el enunciado (B < 10)

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(simbolos.charAt(n % base));
            n /= base;
        }

        return sb.reverse().toString();
    };


    public void setB(int b) {
        B = b;
    }

    //Imprimir el resultado de la función anterior
    Consumer<String> imprimir = texto -> System.out.println(texto);



}
