public class Factorial {
    public static void main (String[] args) {
        int n, f=1;
        n=ES.leeN("Introduce el numero del que quieres calcular el factorial: ");
        for (int i=1;i!=n+1;i++) {
            f=f*i;
        }
        System.out.println("El factorial de "+n+" es "+f);
    }
}
