public class Nprimos {
    public static void main(String[] args) {
        int i, c=1;
        boolean j;
        i=ES.leeN("Introduce el numero de primos que quieres: ");
        for (int n=3;c<=i;n++) {
            j=esPrimo(n);
            if (j) {
                System.out.println(n);
                c++;
            }
        }
    }
    public static boolean esPrimo(int e) {
        if (e==4) {
            return false;
        }
        for (int x=2;x<e/2;x++) {
            if (e%x == 0) {
                return false;
            }
        }
        return true;
    }
}