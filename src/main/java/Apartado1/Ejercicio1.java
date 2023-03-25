package Apartado1;

public class Ejercicio1 {
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

    public double getN() {
        return N;
    }

    public void setN(double N) {
        this.N = N;
    }
}
