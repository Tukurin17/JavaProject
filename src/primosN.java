public class primosN {
    public static void main(String[] args) {
        int i;
        boolean j;
        i=ES.leeN("Introduce un numero hasta donde llegar: ");
        for (int n=3;n!=i;n++) {
            j=esPrimo(n);
            if (j) {
                System.out.println(n);
            }
        }
    }
    static boolean esPrimo(int e) {
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