public class Potencia {
    public static void main (String[] args) {
        int n, p, c=1, i;
        n=ES.leeN("Introduce el numero: ");
        i=n;
        p=ES.leeN("Introduce la potencia: ");
        while (c!=p) {
            n=n*i;
            c++;
        }
        System.out.println("El resultado es "+n);
    }
}
