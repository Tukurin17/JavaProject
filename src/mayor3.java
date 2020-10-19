public class mayor3 {
    public static void main (String[] args) {
        int n1, n2, n3;
        n1=ES.leeN("Introduce el primer numero: ");
        n2=ES.leeN("Introduce el segundo numero: ");
        n3=ES.leeN("Introduce el tercer numero: ");
        int i=(n1>n2)?n1:n2;
        int n=(i>n3)?i:n3;
        System.out.println("El numero " + n +" es mayor!");
    }
}
