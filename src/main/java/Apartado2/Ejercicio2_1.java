package Apartado2;
public class Ejercicio2_1 {

    void factorial(int num, int div)
    {
        if (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                factorial(num/div,div);
            } else {
                factorial(num,div+1);
            }
        }
    }


}
