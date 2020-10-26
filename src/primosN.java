public class primosN {
    public static void main(String[] args) {
        int i;
        i=ES.leeN("Introduce un numero hasta donde llegar: ");
        for (int n=2;n!=i;n++) {
            if (esPrimo(n)) {
                System.out.println(n);
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