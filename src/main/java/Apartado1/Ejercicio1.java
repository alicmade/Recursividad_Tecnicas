package Apartado1;

public class Ejercicio1 {
    //a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
    //valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
    //Calcula la raíz cuadrada, a través de método bisectriz, que se basa en ir dividiendo los intervalos a la mitad hasta verificar en que intervalo se cambia
    //de signo y ahi se encontrará la raíz. Si cambiaramos el valor de N a tres, por ejemplo, estaríamos calculado la raíz de tres. Si cambiaramos f(x) la funcion
    //bisect() seguirá buscando la raíz cuadrada. Pero dará error si la función f(x) no es continua.

    //implementamos un algoritmo iterativo equivalente.
    double N = 2;
     final double PREC = 1e-6;

     double f (double x) {
        return x*x - N;
    }

     double bisect (double min, double max) {
        double med = (min+max)/2;
        if (max-min < PREC) {
            return med;
        } else if (f(min)*f(med) < 0) {
            return bisect(min, med);
        } else {
            return bisect(med, max);
        }
    }

    double bisectOtraforma (double min, double max) {
        double med = (min+max)/2;
        while (max-min >= PREC) {
            if (f(min)*f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
            med = (min+max)/2;
        }
        return med;
    }

    public double getN() {
        return N;
    }

    public void setN(double N) {
        this.N = N;
    }
    /* He dejado las dos forma con recursividad y de forma iterativa para ver la diferencia de forma más clara*/

}
