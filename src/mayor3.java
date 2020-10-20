public class mayor3 {
    public static void main (String[] args) {
        int n1, n2, n3, n;
        n1=ES.leeN("Introduce el primer numero: ");
        n2=ES.leeN("Introduce el segundo numero: ");
        n3=ES.leeN("Introduce el tercer numero: ");
        if (n1>n2 && n1>n3) {
            n=n1;
        }
        else if (n2>n3) {
            n=n2;
        }
        else {
            n=n3;
        }
        System.out.println("El numero " + n +" es mayor!");
    }
}
