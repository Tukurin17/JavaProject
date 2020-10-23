public class MCD {
    public static void main (String[] args) {
        int n1, n2, i;
        n1=ES.leeN("Introduce el primer numero: ");
        n2=ES.leeN("Introduce el segundo numero: ");
        i=iterativo(n1, n2);
        System.out.println("El MCD es: "+i);
    }
    static int iterativo (int n1, int n2) {
        while (n1!=n2) {
            if (n1>n2) {
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }
        }
        return n1;
    }
}
