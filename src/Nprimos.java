public class Nprimos {
    public static void main(String[] args) {
        int i, c=1;
        i=ES.leeN("Introduce el numero de primos que quieres: ");
        for (int n=2;c<=i;n++) {
            if (esPrimo(n)) {
                System.out.println(n);
                c++;
            }
        }
    }
    static boolean esPrimo(int e) {
        for (int x=2;x<=e/2;x++) {
            if (e%x == 0) {
                return false;
            }
        }
        return true;
    }
}