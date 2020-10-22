public class Factorial {
    public static void main (String[] args) {
        double n;
        n=ES.leeN("Introduce el numero del que quieres calcular el Factorial: ");
        double factorial=iterativo(n);
        double factorialr=recursivo(n);
        System.out.println("El factorial iterativo de "+n+" es "+factorial);
        System.out.println("El factorial recursivo de "+n+" es "+factorialr);
    }
    static double iterativo(double n) {
        double f=1;
        for (int i=1;i!=n+1;i++) {
            f=f*i;
        }
        return f;
    }

    static double recursivo(double n) {
        if (n==0) {
            return 1;
        }
        else {
            return n*(recursivo(n-1));
        }
    }
}
